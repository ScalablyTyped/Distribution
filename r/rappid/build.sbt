organization := "org.scalablytyped"
name := "rappid"
version := "1.5-dt-20180910Z-6496d0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20181206Z-21fb72",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20180910Z-927af6",
  "org.scalablytyped" %%% "graphlib" % "2.1.1-dt-20180910Z-50bf06",
  "org.scalablytyped" %%% "jointjs" % "2.2.1-129005",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181214Z-7b71e9",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-e65330",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20180910Z-1e442c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        