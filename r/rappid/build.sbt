organization := "com.scalablytyped"
name := "rappid"
version := "1.5-dt-20180910Z-c9c897"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "backbone" % "1.3.3-dt-20181121Z-4472e4",
  "com.scalablytyped" %%% "dagre" % "0.7-dt-20180910Z-78779a",
  "com.scalablytyped" %%% "graphlib" % "2.1.1-dt-20180910Z-68732e",
  "com.scalablytyped" %%% "jointjs" % "2.2.1-3fa382",
  "com.scalablytyped" %%% "jquery" % "3.3-dt-20181027Z-d287eb",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-0335c2",
  "com.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-9c5dc2",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "underscore" % "1.8-dt-20180910Z-87c49b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        