organization := "org.scalablytyped"
name := "react-plotly_dot_js"
version := "2.2-dt-20190621Z-fcf3d8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-de471c",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-7e7f15",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-b0208e",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-56f9bd",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-721ca1",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-c62b1b",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-0913d8",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-fa90b3",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-6f801b",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-03a0ea",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-cb61b4",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-567194",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-86bc56",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-807d77",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-748106",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-08cd1b",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-da723e",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-27caa9",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-1927c4",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-2a85cd",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-1b2f80",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-2a6244",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-749b1b",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-74424d",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-e8ea98",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-15c2dd",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-78369d",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-8ccd8f",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-8b8d4c",
  "org.scalablytyped" %%% "plotly_dot_js" % "1.44-dt-20190612Z-75704b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190731Z-e8f22e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        