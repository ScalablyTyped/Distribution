organization := "org.scalablytyped"
name := "rebass"
version := "4.0-dt-20200514Z-b67382"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-6403b2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20200723Z-d06c5c",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "styled-components" % "5.1-dt-20200706Z-7a9fc0",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20200309Z-b4ebf7",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20200713Z-971d02")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
