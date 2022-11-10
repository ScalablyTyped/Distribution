organization := "org.scalablytyped"
name := "react-native-screens"
version := "3.18.2-6e4dee"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "hammerjs" % "2.0.8-dt-20220819Z-11fa97",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-83d8b1",
  "org.scalablytyped" %%% "react-native-gesture-handler" % "2.8.0-2017b7",
  "org.scalablytyped" %%% "react-native-reanimated" % "2.12.0-d60fb1",
  "org.scalablytyped" %%% "react-native-safe-area-context" % "4.3.4-3617ea",
  "org.scalablytyped" %%% "react-navigation" % "4.4.4-de992b",
  "org.scalablytyped" %%% "react-navigation__core" % "6.4.0-8c3613",
  "org.scalablytyped" %%% "react-navigation__routers" % "6.1.3-73a849",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-6d095b",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
