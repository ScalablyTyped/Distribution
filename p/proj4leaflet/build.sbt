organization := "org.scalablytyped"
name := "proj4leaflet"
version := "1.0-dt-20181017Z-4186b8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-a51fd7",
  "org.scalablytyped" %%% "leaflet" % "1.5-dt-20191022Z-831838",
  "org.scalablytyped" %%% "proj4" % "2.5-dt-20181212Z-8784dd",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        