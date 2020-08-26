organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20200515Z-45f144"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20200515Z-d2717d",
  "org.scalablytyped" %%% "d3-scale" % "2.2-dt-20200515Z-98ef46",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20200515Z-d0cba8",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20200515Z-2fdaf9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20200723Z-d06c5c",
  "org.scalablytyped" %%% "react-native-svg" % "12.1.0-1dd233",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
