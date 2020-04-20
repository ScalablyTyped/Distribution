organization := "org.scalablytyped"
name := "proj4leaflet"
version := "1.0-dt-20181017Z-3632b1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-bd3076",
  "org.scalablytyped" %%% "leaflet" % "1.5-dt-20200320Z-a59cf8",
  "org.scalablytyped" %%% "proj4" % "2.5-dt-20181212Z-76d536",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
