organization := "org.scalablytyped"
name := "react-three__fiber"
version := "8.7.4-77c23f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "immer" % "9.0.15-1dfeef",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20220927Z-e8ccda",
  "org.scalablytyped" %%% "react-reconciler" % "0.28-dt-20220624Z-f8a5d5",
  "org.scalablytyped" %%% "react-use-measure" % "2.1.1-4e4be1",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "three" % "0.144-dt-20220902Z-a52a93",
  "org.scalablytyped" %%% "webxr" % "0.5-dt-20220721Z-c71d19",
  "org.scalablytyped" %%% "zustand" % "4.1.1-eb6f85")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
