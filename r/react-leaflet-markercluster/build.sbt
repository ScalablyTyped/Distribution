organization := "org.scalablytyped"
name := "react-leaflet-markercluster"
version := "2.0-dt-20181121Z-89c47b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190106Z-038c51",
  "org.scalablytyped" %%% "leaflet" % "1.4-dt-20190121Z-73a230",
  "org.scalablytyped" %%% "leaflet_dot_markercluster" % "1.0-dt-20180216Z-bcd2eb",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-f7085e",
  "org.scalablytyped" %%% "react-leaflet" % "1.1-dt-20180721Z-8a64b2",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        