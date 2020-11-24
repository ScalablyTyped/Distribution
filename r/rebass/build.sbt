organization := "org.scalablytyped"
name := "rebass"
version := "4.0-dt-20200925Z-afd0e8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-fa358f",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-42d53d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-0012d8",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-cfb347",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-d8889c",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "styled-components" % "5.1-dt-20201010Z-23436d",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20201028Z-d40705",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20200925Z-abfc1a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
