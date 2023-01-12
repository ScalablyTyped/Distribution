organization := "org.scalablytyped"
name := "react-three__fiber"
version := "8.7.4-844dd6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "immer" % "9.0.15-70a8ed",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-27f111",
  "org.scalablytyped" %%% "react-reconciler" % "0.28-dt-20220624Z-d2fd19",
  "org.scalablytyped" %%% "react-use-measure" % "2.1.1-b74e20",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "three" % "0.146-dt-20221106Z-9f51e0",
  "org.scalablytyped" %%% "webxr" % "0.5-dt-20220721Z-bbf918",
  "org.scalablytyped" %%% "zustand" % "4.1.1-3ff0ea")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
