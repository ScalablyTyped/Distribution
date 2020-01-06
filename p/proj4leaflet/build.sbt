organization := "org.scalablytyped"
name := "proj4leaflet"
version := "1.0-dt-20181017Z-aa153e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-871c5b",
  "org.scalablytyped" %%% "leaflet" % "1.5-dt-20191217Z-2e8b3a",
  "org.scalablytyped" %%% "proj4" % "2.5-dt-20181212Z-917a9b",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        