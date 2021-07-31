organization := "org.scalablytyped"
name := "react-plotly_dot_js"
version := "2.2-dt-20200515Z-2995f3"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "d3" % "6.2-dt-20201118Z-238d14",
  "org.scalablytyped" %%% "d3-array" % "2.8-dt-20201116Z-b7e11e",
  "org.scalablytyped" %%% "d3-axis" % "2.0-dt-20201104Z-0e0933",
  "org.scalablytyped" %%% "d3-brush" % "2.1-dt-20200930Z-8041c9",
  "org.scalablytyped" %%% "d3-chord" % "2.0-dt-20200929Z-2c448a",
  "org.scalablytyped" %%% "d3-color" % "2.0-dt-20201117Z-64d81e",
  "org.scalablytyped" %%% "d3-contour" % "2.0-dt-20200930Z-42cade",
  "org.scalablytyped" %%% "d3-delaunay" % "5.3-dt-20200930Z-472d0a",
  "org.scalablytyped" %%% "d3-dispatch" % "2.0-dt-20200930Z-f1257f",
  "org.scalablytyped" %%% "d3-drag" % "2.0-dt-20201028Z-cea22b",
  "org.scalablytyped" %%% "d3-dsv" % "2.0-dt-20201001Z-d03388",
  "org.scalablytyped" %%% "d3-ease" % "2.0-dt-20200930Z-c67511",
  "org.scalablytyped" %%% "d3-fetch" % "2.0-dt-20201001Z-d274c2",
  "org.scalablytyped" %%% "d3-force" % "2.1-dt-20201002Z-46589a",
  "org.scalablytyped" %%% "d3-format" % "2.0-dt-20200930Z-a75265",
  "org.scalablytyped" %%% "d3-geo" % "2.0-dt-20201002Z-f96104",
  "org.scalablytyped" %%% "d3-hierarchy" % "2.0-dt-20200929Z-ecb2ab",
  "org.scalablytyped" %%% "d3-interpolate" % "2.0-dt-20201001Z-d5db1f",
  "org.scalablytyped" %%% "d3-path" % "2.0-dt-20201002Z-1156c5",
  "org.scalablytyped" %%% "d3-quadtree" % "2.0-dt-20200930Z-a61218",
  "org.scalablytyped" %%% "d3-random" % "2.2-dt-20201002Z-d17e5c",
  "org.scalablytyped" %%% "d3-scale" % "3.2-dt-20201104Z-e6650a",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-68e4fa",
  "org.scalablytyped" %%% "d3-shape" % "2.0-dt-20201028Z-f64cca",
  "org.scalablytyped" %%% "d3-time" % "2.0-dt-20201002Z-ab0101",
  "org.scalablytyped" %%% "d3-time-format" % "3.0-dt-20201002Z-d95368",
  "org.scalablytyped" %%% "d3-timer" % "2.0-dt-20201002Z-f43798",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-a74a74",
  "org.scalablytyped" %%% "d3-zoom" % "2.0-dt-20201104Z-e733a2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20201002Z-fc1d16",
  "org.scalablytyped" %%% "plotly_dot_js" % "1.54-dt-20201028Z-45497d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
