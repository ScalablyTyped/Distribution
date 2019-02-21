organization := "org.scalablytyped"
name := "proj4leaflet"
version := "1.0-dt-20181017Z-0fe68c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190212Z-038c51",
  "org.scalablytyped" %%% "leaflet" % "1.4-dt-20190221Z-6b3797",
  "org.scalablytyped" %%% "proj4" % "2.5-dt-20181212Z-085c81",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        