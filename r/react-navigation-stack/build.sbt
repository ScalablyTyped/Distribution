organization := "org.scalablytyped"
name := "react-navigation-stack"
version := "2.8.2-92b6e0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b0fb5c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-f69275",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-695c73",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20200723Z-c7c2f8",
  "org.scalablytyped" %%% "react-native-gesture-handler" % "1.7.0-4940e6",
  "org.scalablytyped" %%% "react-native-safe-area-context" % "3.0.7-4cf408",
  "org.scalablytyped" %%% "react-navigation" % "4.4.0-923437",
  "org.scalablytyped" %%% "std" % "3.9-7c0472")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
