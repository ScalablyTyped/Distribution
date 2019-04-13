organization := "org.scalablytyped"
name := "proj4leaflet"
version := "1.0-dt-20181017Z-ee21f2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-72e3ef",
  "org.scalablytyped" %%% "leaflet" % "1.4-dt-20190221Z-0629a5",
  "org.scalablytyped" %%% "proj4" % "2.5-dt-20181212Z-5cf3d7",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        