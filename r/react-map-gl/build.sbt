organization := "org.scalablytyped"
name := "react-map-gl"
version := "5.0-dt-20190619Z-c7101a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c945ed",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-d5dfc4",
  "org.scalablytyped" %%% "gl-matrix" % "2.4-dt-20190322Z-8d5886",
  "org.scalablytyped" %%% "mapbox-gl" % "v0.51.0-dt-20190709Z-00c734",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-55594c",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20190313Z-1fe035")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        