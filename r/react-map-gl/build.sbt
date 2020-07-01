organization := "org.scalablytyped"
name := "react-map-gl"
version := "5.2-dt-20200515Z-cce575"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-7dae47",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20200515Z-230004",
  "org.scalablytyped" %%% "gl-matrix" % "2.4-dt-20200515Z-7fc70a",
  "org.scalablytyped" %%% "mapbox-gl" % "1.11-dt-20200622Z-80dab8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-034048",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200624Z-23874e",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20190313Z-edcf66")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
