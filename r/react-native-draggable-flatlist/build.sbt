organization := "org.scalablytyped"
name := "react-native-draggable-flatlist"
version := "3.1.2-c9a3db"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "hammerjs" % "2.0.8-dt-20220819Z-c27fc0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-041ba4",
  "org.scalablytyped" %%% "react-native-gesture-handler" % "2.8.0-639eba",
  "org.scalablytyped" %%% "react-native-reanimated" % "2.12.0-eabdf9",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-4dfa9f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
