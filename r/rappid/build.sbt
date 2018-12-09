organization := "org.scalablytyped"
name := "rappid"
version := "1.5-dt-20180910Z-193003"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20181206Z-7b30f8",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20180910Z-7b0ddf",
  "org.scalablytyped" %%% "graphlib" % "2.1.1-dt-20180910Z-609d99",
  "org.scalablytyped" %%% "jointjs" % "2.2.1-d032cb",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181209Z-f8f791",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-27b737",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20180910Z-057dfb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        