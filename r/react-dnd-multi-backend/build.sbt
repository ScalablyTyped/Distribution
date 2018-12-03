organization := "com.scalablytyped"
name := "react-dnd-multi-backend"
version := "3.0-dt-20180910Z-8b1a88"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "asap" % "2.0-dt-20180910Z-31d1ac",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "dnd-core" % "7.0.0-086c10",
  "com.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-118bf2",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-aa3127",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181203Z-843f9f",
  "com.scalablytyped" %%% "redux" % "4.0.1-9e09bf",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-45b962",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        