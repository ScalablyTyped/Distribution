organization := "org.scalablytyped"
name := "rc-tree-select"
version := "5.5.3-c25254"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "rc-motion" % "2.6.2-08d930",
  "org.scalablytyped" %%% "rc-select" % "14.1.13-12d094",
  "org.scalablytyped" %%% "rc-tree" % "5.7.0-af7014",
  "org.scalablytyped" %%% "rc-trigger" % "5.3.3-d77f96",
  "org.scalablytyped" %%% "rc-virtual-list" % "3.4.8-da24ec",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
