organization := "org.scalablytyped"
name := "react-map-gl"
version := "5.0-dt-20190619Z-c97b69"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-8b8d4c",
  "org.scalablytyped" %%% "gl-matrix" % "2.4-dt-20190322Z-17f1da",
  "org.scalablytyped" %%% "mapbox-gl" % "v0.54.0-dt-20190815Z-0fa502",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-46401f",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20190313Z-7ef3df")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        