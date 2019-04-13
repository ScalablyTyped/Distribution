organization := "org.scalablytyped"
name := "react-plotly_dot_js"
version := "2.2-dt-20181012Z-266e06"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-c92ab3",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-65de0d",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-fe436a",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-699394",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-d4ed0a",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-0e60cb",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-1e443b",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-d34671",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-9acf46",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-6958fe",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-c9b6cd",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-e4de32",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-ec2ede",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-1091ee",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-e29191",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-fb5dff",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-da6196",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-80039b",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-b5fdd6",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-11bd50",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-037d61",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-7fa156",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-4fd853",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-80a352",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-b7698f",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-0cc4da",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-2b9b0b",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-60afad",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-72e3ef",
  "org.scalablytyped" %%% "plotly_dot_js" % "1.44-dt-20190404Z-b2e501",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-7e744c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-5f45a9",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        