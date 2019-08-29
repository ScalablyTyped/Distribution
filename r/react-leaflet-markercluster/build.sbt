organization := "org.scalablytyped"
name := "react-leaflet-markercluster"
version := "2.0-dt-20181121Z-ad8152"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-2af848",
  "org.scalablytyped" %%% "leaflet" % "1.5-dt-20190814Z-4119b7",
  "org.scalablytyped" %%% "leaflet_dot_markercluster" % "1.4-dt-20190326Z-dc0b4f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-fd4af0",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-6dcbc8",
  "org.scalablytyped" %%% "react-leaflet" % "2.4-dt-20190813Z-d116b9",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        