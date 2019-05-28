organization := "org.scalablytyped"
name := "react-plotly_dot_js"
version := "2.2-dt-20181012Z-af3260"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.4-b274af",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-0e6a39",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-d58025",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-b05d76",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-6cbe4b",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-fbf88c",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-757cbd",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-51694f",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-edfd01",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-c42084",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-3bdbd7",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-c5c6cc",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-d7918b",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-372f60",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-7bc2c7",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-4a88a2",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-7add4f",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-f6c341",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-d2f77e",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-279aee",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-f88f7e",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-4eb385",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-75b402",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-993498",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-d1e6a0",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-5ec687",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-3e94a2",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-a98106",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-96a3fe",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-dbce77",
  "org.scalablytyped" %%% "plotly_dot_js" % "1.44-dt-20190506Z-1f281c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190520Z-336e99",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        