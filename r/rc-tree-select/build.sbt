organization := "org.scalablytyped"
name := "rc-tree-select"
version := "5.5.3-8e5141"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "rc-motion" % "2.6.2-03ca5a",
  "org.scalablytyped" %%% "rc-select" % "14.1.13-7c8628",
  "org.scalablytyped" %%% "rc-tree" % "5.7.0-3cc4de",
  "org.scalablytyped" %%% "rc-trigger" % "5.3.3-177b7a",
  "org.scalablytyped" %%% "rc-virtual-list" % "3.4.8-e1f90f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
