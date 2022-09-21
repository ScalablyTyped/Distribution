organization := "org.scalablytyped"
name := "rc-tree-select"
version := "5.5.0-39d4a2"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "rc-motion" % "2.6.2-9bbc67",
  "org.scalablytyped" %%% "rc-select" % "14.1.13-0175ee",
  "org.scalablytyped" %%% "rc-tree" % "5.7.0-57b334",
  "org.scalablytyped" %%% "rc-trigger" % "5.3.1-dc7648",
  "org.scalablytyped" %%% "rc-virtual-list" % "3.4.8-7aa592",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
