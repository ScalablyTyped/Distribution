organization := "org.scalablytyped"
name := "react-navigation-stack"
version := "2.10.2-39d6f6"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-fa358f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-0012d8",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-cfb347",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-d8889c",
  "org.scalablytyped" %%% "react-native-community__masked-view" % "0.1.10-0f06bc",
  "org.scalablytyped" %%% "react-native-gesture-handler" % "1.8.0-221fad",
  "org.scalablytyped" %%% "react-native-safe-area-context" % "3.1.4-2d73dc",
  "org.scalablytyped" %%% "react-navigation" % "4.4.3-17a6f0",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
