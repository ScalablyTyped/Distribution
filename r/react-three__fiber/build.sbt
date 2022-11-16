organization := "org.scalablytyped"
name := "react-three__fiber"
version := "8.7.4-4534e8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "immer" % "9.0.15-9c3d92",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-041ba4",
  "org.scalablytyped" %%% "react-reconciler" % "0.28-dt-20220624Z-e8310c",
  "org.scalablytyped" %%% "react-use-measure" % "2.1.1-f14c97",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "three" % "0.146-dt-20221106Z-0a1a67",
  "org.scalablytyped" %%% "webxr" % "0.5-dt-20220721Z-b9b78e",
  "org.scalablytyped" %%% "zustand" % "4.1.1-a9b615")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
