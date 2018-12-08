organization := "org.scalablytyped"
name := "react-leaflet-markercluster"
version := "2.0-dt-20181122Z-697c97"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-3f2d21",
  "org.scalablytyped" %%% "leaflet" % "1.2-dt-20181109Z-26559d",
  "org.scalablytyped" %%% "leaflet_dot_markercluster" % "1.0-dt-20180910Z-4f6d8e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-000ab2",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-1b8e7c",
  "org.scalablytyped" %%% "react-leaflet" % "1.1-dt-20180910Z-4a8888",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        