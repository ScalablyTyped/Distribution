organization := "org.scalablytyped"
name := "react-leaflet-markercluster"
version := "2.0-dt-20181121Z-af828a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-67022f",
  "org.scalablytyped" %%% "leaflet" % "1.5-dt-20200117Z-7d3a14",
  "org.scalablytyped" %%% "leaflet_dot_markercluster" % "1.4-dt-20191223Z-f38c27",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-fc5268",
  "org.scalablytyped" %%% "react-leaflet" % "2.5-dt-20191022Z-848760",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
