organization := "org.scalablytyped"
name := "react-plotly_dot_js"
version := "2.2-dt-20200515Z-7b4428"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20200515Z-570cd7",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20200515Z-c6d750",
  "org.scalablytyped" %%% "d3-brush" % "1.1-dt-20200605Z-374db3",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20200515Z-d386ba",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20200515Z-23620d",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20200515Z-17facc",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20200515Z-dbc08c",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20200707Z-0f600a",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20200515Z-1185cd",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20200515Z-c1a8fc",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20200515Z-efe1bf",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20200515Z-a5e634",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20200515Z-9133bd",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20200515Z-c8476a",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20200515Z-3b95db",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20200515Z-871568",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20200515Z-1b2311",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20200515Z-d2717d",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20200515Z-655bbf",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20200515Z-b9dd46",
  "org.scalablytyped" %%% "d3-scale" % "2.2-dt-20200515Z-98ef46",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200707Z-7b7f3a",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20200515Z-d0cba8",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20200515Z-2fdaf9",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20200515Z-7d819a",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20200515Z-c44d09",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200515Z-06118c",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20200515Z-b574fb",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20200515Z-304279",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20200515Z-7b0d2d",
  "org.scalablytyped" %%% "plotly_dot_js" % "1.50-dt-20200720Z-5bf2d1",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
