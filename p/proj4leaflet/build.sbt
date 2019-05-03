organization := "org.scalablytyped"
name := "proj4leaflet"
version := "1.0-dt-20181017Z-90bde8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-c5348d",
  "org.scalablytyped" %%% "leaflet" % "1.4-dt-20190417Z-93b9f9",
  "org.scalablytyped" %%% "proj4" % "2.5-dt-20181212Z-99ff77",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        