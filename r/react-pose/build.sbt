organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.10-0a3879"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.11-d33e20",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-a840ef",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-7e22bd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "style-value-types" % "5.1.2-88addb",
  "org.scalablytyped" %%% "ts-essentials" % "9.3.0-27b15d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
