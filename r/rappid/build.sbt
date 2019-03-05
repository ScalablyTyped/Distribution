organization := "org.scalablytyped"
name := "rappid"
version := "1.5-dt-20190213Z-2bd4b4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20190215Z-dfc194",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20190212Z-0b4598",
  "org.scalablytyped" %%% "graphlib" % "2.1.1-dt-20180214Z-dcb844",
  "org.scalablytyped" %%% "jointjs" % "2.2.1-c044e4",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-f5a31c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-b709fe",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190301Z-154b82")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        