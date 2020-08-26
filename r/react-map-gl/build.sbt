organization := "org.scalablytyped"
name := "react-map-gl"
version := "5.2-dt-20200724Z-aa1d0e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20200515Z-7b0d2d",
  "org.scalablytyped" %%% "gl-matrix" % "2.4-dt-20200515Z-70615e",
  "org.scalablytyped" %%% "mapbox-gl" % "1.11-dt-20200707Z-aae4bb",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20190313Z-261e78")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
