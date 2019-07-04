organization := "org.scalablytyped"
name := "react-map-gl"
version := "5.0-dt-20190619Z-567bd1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-5c5531",
  "org.scalablytyped" %%% "gl-matrix" % "2.4-dt-20190322Z-1823ec",
  "org.scalablytyped" %%% "mapbox-gl" % "v0.51.0-dt-20190628Z-2d4b2d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-97e7d2",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20190313Z-c9e233")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        