organization := "org.scalablytyped"
name := "react-three__fiber"
version := "8.7.4-ca1186"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "immer" % "9.0.15-be4a71",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221027Z-1a0a13",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-ebe936",
  "org.scalablytyped" %%% "react-reconciler" % "0.28-dt-20220624Z-f1c526",
  "org.scalablytyped" %%% "react-use-measure" % "2.1.1-f1aa45",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "three" % "0.144-dt-20220902Z-3c5177",
  "org.scalablytyped" %%% "webxr" % "0.5-dt-20220721Z-ef4a6b",
  "org.scalablytyped" %%% "zustand" % "4.1.1-5cb291")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
