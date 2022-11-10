organization := "org.scalablytyped"
name := "react-three__fiber"
version := "8.7.4-2b4642"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "immer" % "9.0.15-37a7be",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-83d8b1",
  "org.scalablytyped" %%% "react-reconciler" % "0.28-dt-20220624Z-a9c44c",
  "org.scalablytyped" %%% "react-use-measure" % "2.1.1-9ec880",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "three" % "0.146-dt-20221106Z-23abf2",
  "org.scalablytyped" %%% "webxr" % "0.5-dt-20220721Z-4a9bb7",
  "org.scalablytyped" %%% "zustand" % "4.1.1-ac8df5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
