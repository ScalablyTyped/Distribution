organization := "org.scalablytyped"
name := "react-leaflet-markercluster"
version := "2.0-dt-20181121Z-e14ba6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-cccebd",
  "org.scalablytyped" %%% "leaflet" % "1.5-dt-20191009Z-0e093b",
  "org.scalablytyped" %%% "leaflet_dot_markercluster" % "1.4-dt-20190326Z-1003aa",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-3b437f",
  "org.scalablytyped" %%% "react-leaflet" % "2.4-dt-20190813Z-2beed7",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        