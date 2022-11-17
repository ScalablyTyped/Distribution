organization := "org.scalablytyped"
name := "react-native-gesture-handler"
version := "2.8.0-d52920"
scalaVersion := "3.2.2-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-b003b4",
  "org.scalablytyped" %%% "hammerjs" % "2.0.8-dt-20220819Z-0a1be8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-ddcd58",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-0ec907",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-3ee483",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-e9ba8f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-864a4c",
  "org.scalablytyped" %%% "std" % "4.9-448261")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
