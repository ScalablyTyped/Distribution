organization := "com.scalablytyped"
name := "react-jss"
version := "8.6-dt-20180918Z-28455e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "indefinite-observable" % "1.0.2-19bfe2",
  "com.scalablytyped" %%% "jss" % "9.5-dt-20181018Z-8fd95a",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181203Z-843f9f",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-45b962",
  "com.scalablytyped" %%% "theming" % "1.3-dt-20181109Z-534493",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        