organization := "com.scalablytyped"
name := "react-dnd-html5-backend"
version := "5.0.1-2bf041"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "asap" % "2.0-dt-20180910Z-0f7bcb",
  "com.scalablytyped" %%% "autobind-decorator" % "2.1.0-db8b59",
  "com.scalablytyped" %%% "dnd-core" % "4.0.5-62e974",
  "com.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-c8b620",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "redux" % "4.0.1-d3681d",
  "com.scalablytyped" %%% "shallowequal" % "v0.2.2-dt-20180910Z-9e377c",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-e6336c",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        