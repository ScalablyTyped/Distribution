organization := "org.scalablytyped"
name := "react-native-screens"
version := "3.18.2-cf98b6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "hammerjs" % "2.0.8-dt-20220819Z-813d7d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-27f111",
  "org.scalablytyped" %%% "react-native-gesture-handler" % "2.8.0-e32889",
  "org.scalablytyped" %%% "react-native-reanimated" % "2.12.0-560047",
  "org.scalablytyped" %%% "react-native-safe-area-context" % "4.3.4-4604db",
  "org.scalablytyped" %%% "react-navigation" % "4.4.4-37bfa8",
  "org.scalablytyped" %%% "react-navigation__core" % "6.4.0-c416d1",
  "org.scalablytyped" %%% "react-navigation__routers" % "6.1.3-c97649",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-a531dd",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
