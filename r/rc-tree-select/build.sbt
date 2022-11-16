organization := "org.scalablytyped"
name := "rc-tree-select"
version := "5.5.3-ac588e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "rc-motion" % "2.6.2-111e7e",
  "org.scalablytyped" %%% "rc-select" % "14.1.13-01074a",
  "org.scalablytyped" %%% "rc-tree" % "5.7.0-86d1e8",
  "org.scalablytyped" %%% "rc-trigger" % "5.3.3-2466b7",
  "org.scalablytyped" %%% "rc-virtual-list" % "3.4.8-3db371",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
