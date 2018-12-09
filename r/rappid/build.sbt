organization := "org.scalablytyped"
name := "rappid"
version := "1.5-dt-20180910Z-3d0ee1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20181206Z-1fd9e5",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20180910Z-8f8140",
  "org.scalablytyped" %%% "graphlib" % "2.1.1-dt-20180910Z-10179d",
  "org.scalablytyped" %%% "jointjs" % "2.2.1-c53bae",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181209Z-928df5",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-081654",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20180910Z-595b36")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        