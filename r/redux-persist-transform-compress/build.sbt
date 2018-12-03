organization := "com.scalablytyped"
name := "redux-persist-transform-compress"
version := "4.2.0-cce745"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "json-stringify-safe" % "5.0-dt-20180910Z-5c42d2",
  "com.scalablytyped" %%% "lz-string" % "1.3-dt-20180910Z-2d3923",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181203Z-843f9f",
  "com.scalablytyped" %%% "redux" % "4.0.1-9e09bf",
  "com.scalablytyped" %%% "redux-persist" % "5.10.0-fa5047",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-45b962",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        