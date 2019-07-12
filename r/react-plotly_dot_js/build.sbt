organization := "org.scalablytyped"
name := "react-plotly_dot_js"
version := "2.2-dt-20190621Z-530149"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c945ed",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-b30444",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-a06582",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-fd9bf0",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-c58d76",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-20dc0e",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-e040d2",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-b10fed",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-ffa4d1",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-4edbf5",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-b5d2e5",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-d28608",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-174460",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-d86cab",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-ac19db",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-e1837a",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-95ea07",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-e7ca07",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-9d7225",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-4203a6",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-4fdea5",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-2307af",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-340848",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-75922a",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-8ea32f",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-cd9d08",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-2e351b",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-525443",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-f0cf67",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-d5dfc4",
  "org.scalablytyped" %%% "plotly_dot_js" % "1.44-dt-20190612Z-8e8e44",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-55594c",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        