organization := "org.scalablytyped"
name := "rappid"
version := "1.5-dt-20190213Z-e36cd2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20190322Z-c3a15b",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20190212Z-1eeb27",
  "org.scalablytyped" %%% "graphlib" % "2.1.1-dt-20190322Z-28735e",
  "org.scalablytyped" %%% "jointjs" % "2.2.1-a5456c",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-8c3191",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-bc4aa6",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190322Z-360779")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        