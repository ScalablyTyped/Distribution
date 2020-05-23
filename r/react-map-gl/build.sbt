organization := "org.scalablytyped"
name := "react-map-gl"
version := "5.2-dt-20200515Z-e35e19"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20200515Z-0ec701",
  "org.scalablytyped" %%% "gl-matrix" % "2.4-dt-20200515Z-11febd",
  "org.scalablytyped" %%% "mapbox-gl" % "1.10-dt-20200520Z-6fb516",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20190313Z-cf89a0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
