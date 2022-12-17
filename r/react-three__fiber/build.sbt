organization := "org.scalablytyped"
name := "react-three__fiber"
version := "8.7.4-c03b62"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "immer" % "9.0.15-78fdff",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-e43cee",
  "org.scalablytyped" %%% "react-reconciler" % "0.28-dt-20220624Z-5e4c7c",
  "org.scalablytyped" %%% "react-use-measure" % "2.1.1-c98e16",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "three" % "0.146-dt-20221106Z-d874fd",
  "org.scalablytyped" %%% "webxr" % "0.5-dt-20220721Z-07f759",
  "org.scalablytyped" %%% "zustand" % "4.1.1-f6b570")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
