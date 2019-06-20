organization := "org.scalablytyped"
name := "proj4leaflet"
version := "1.0-dt-20181017Z-2ffb87"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-5c5531",
  "org.scalablytyped" %%% "leaflet" % "1.4-dt-20190417Z-6c028f",
  "org.scalablytyped" %%% "proj4" % "2.5-dt-20181212Z-ab1571",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        