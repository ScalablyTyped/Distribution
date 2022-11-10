organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.10-0b88a9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.11-c9feb3",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-9ba060",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-d57024",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "style-value-types" % "5.1.2-5d9ed5",
  "org.scalablytyped" %%% "ts-essentials" % "9.3.0-6949f3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
