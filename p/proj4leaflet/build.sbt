organization := "org.scalablytyped"
name := "proj4leaflet"
version := "1.0-dt-20181017Z-faa231"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190106Z-e6cf03",
  "org.scalablytyped" %%% "leaflet" % "1.2-dt-20181031Z-25437a",
  "org.scalablytyped" %%% "proj4" % "2.5-dt-20181212Z-352611",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        