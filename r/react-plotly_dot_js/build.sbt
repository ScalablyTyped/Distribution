organization := "org.scalablytyped"
name := "react-plotly_dot_js"
version := "2.2-dt-20190621Z-a431f8"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f01b27",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-5767fa",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-ce2f33",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-cf8524",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-f749d7",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-b3bf38",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-937e2d",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-87c431",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-ed1552",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-5902b8",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-1fa545",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-36846f",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-e488be",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-4b2057",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-085016",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-602738",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-deca74",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-5022af",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-4ed27d",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-f12cb3",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-f3382e",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-c42062",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-6b847e",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-238de3",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-f7c416",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-8748cc",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-84af95",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-c47168",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-1c6e89",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-84cce8",
  "org.scalablytyped" %%% "plotly_dot_js" % "1.44-dt-20190809Z-842638",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-93079a",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        