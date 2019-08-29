organization := "org.scalablytyped"
name := "react-plotly_dot_js"
version := "2.2-dt-20190621Z-09639c"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-1eeea6",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-d8f67c",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-440a4b",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-ee0951",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-a75dc5",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-2e4c94",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-a82582",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-22a5da",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-396c3f",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-338960",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-36846f",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-1258c2",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-dd98eb",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-f4c2a3",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-5d0c7e",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-9b9fd7",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-5022af",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-5419f0",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-f12cb3",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-c2d94f",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-38a155",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-ebc33e",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-f89bbe",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-5bdfba",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-8748cc",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-13ae03",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-8f8604",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-a50923",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-2af848",
  "org.scalablytyped" %%% "plotly_dot_js" % "1.44-dt-20190809Z-f50392",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-fd4af0",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-6dcbc8",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        