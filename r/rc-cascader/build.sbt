organization := "org.scalablytyped"
name := "rc-cascader"
version := "3.7.0-e51b4c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "rc-motion" % "2.6.2-9c3c76",
  "org.scalablytyped" %%% "rc-select" % "14.1.13-9c0362",
  "org.scalablytyped" %%% "rc-tree" % "5.7.0-d304cb",
  "org.scalablytyped" %%% "rc-trigger" % "5.3.1-53f196",
  "org.scalablytyped" %%% "rc-virtual-list" % "3.4.8-0c7dd0",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
