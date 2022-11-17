organization := "org.scalablytyped"
name := "rc-tree-select"
version := "5.5.4-08f59c"
scalaVersion := "3.2.2-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-b003b4",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-99df59",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-ddcd58",
  "org.scalablytyped" %%% "rc-motion" % "2.6.2-62a362",
  "org.scalablytyped" %%% "rc-select" % "14.1.13-8ab852",
  "org.scalablytyped" %%% "rc-tree" % "5.7.0-c4f261",
  "org.scalablytyped" %%% "rc-trigger" % "5.3.3-ca62dd",
  "org.scalablytyped" %%% "rc-virtual-list" % "3.4.8-831180",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-0ec907",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-864a4c",
  "org.scalablytyped" %%% "std" % "4.9-448261")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
