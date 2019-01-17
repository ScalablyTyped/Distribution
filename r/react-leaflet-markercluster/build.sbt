organization := "org.scalablytyped"
name := "react-leaflet-markercluster"
version := "2.0-dt-20181121Z-858e36"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190106Z-5af5a4",
  "org.scalablytyped" %%% "leaflet" % "1.2-dt-20181031Z-f21a2f",
  "org.scalablytyped" %%% "leaflet_dot_markercluster" % "1.0-dt-20180216Z-cfaec4",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-334a51",
  "org.scalablytyped" %%% "react-leaflet" % "1.1-dt-20180721Z-da1402",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        