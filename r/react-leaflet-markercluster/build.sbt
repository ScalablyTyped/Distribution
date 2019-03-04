organization := "org.scalablytyped"
name := "react-leaflet-markercluster"
version := "2.0-dt-20181121Z-4c6bad"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-49af40",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190212Z-7a197a",
  "org.scalablytyped" %%% "leaflet" % "1.4-dt-20190221Z-1d2444",
  "org.scalablytyped" %%% "leaflet_dot_markercluster" % "1.0-dt-20180216Z-da8f2f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-7328c8",
  "org.scalablytyped" %%% "react-leaflet" % "2.2-dt-20190226Z-bfb297",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        