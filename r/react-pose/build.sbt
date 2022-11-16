organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.10-52d607"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.11-103f0d",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-8ecb0c",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-042dcf",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "style-value-types" % "5.1.2-9ab27b",
  "org.scalablytyped" %%% "ts-essentials" % "9.3.0-260ad5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
