organization := "com.scalablytyped"
name := "react-redux-epic"
version := "1.1-dt-20181018Z-838053"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181203Z-843f9f",
  "com.scalablytyped" %%% "redux" % "4.0.1-9e09bf",
  "com.scalablytyped" %%% "redux-observable" % "1.0.0-3ea39e",
  "com.scalablytyped" %%% "rxjs" % "6.3.3-d1a1f7",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-45b962",
  "com.scalablytyped" %%% "tslib" % "1.9.3-9baf35",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        