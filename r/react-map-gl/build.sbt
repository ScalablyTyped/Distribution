organization := "org.scalablytyped"
name := "react-map-gl"
version := "5.1-dt-20200117Z-a3a4a4"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-ffacbb",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-7de14c",
  "org.scalablytyped" %%% "gl-matrix" % "2.4-dt-20190322Z-bf2c4d",
  "org.scalablytyped" %%% "mapbox-gl" % "1.7-dt-20200131Z-90d70d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-05a52c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-b17eee",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20190313Z-fa60ec")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
