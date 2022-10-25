organization := "org.scalablytyped"
name := "rc-cascader"
version := "3.7.0-9c33d0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "rc-motion" % "2.6.2-372ca5",
  "org.scalablytyped" %%% "rc-select" % "14.1.13-5c4297",
  "org.scalablytyped" %%% "rc-tree" % "5.7.0-23fd1d",
  "org.scalablytyped" %%% "rc-trigger" % "5.3.1-a2af5b",
  "org.scalablytyped" %%% "rc-virtual-list" % "3.4.8-c2545f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221024Z-9c1cd5",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
