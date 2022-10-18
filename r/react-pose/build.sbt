organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.10-97d0fc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.11-0a3728",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-a840ef",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-9ae9d3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "style-value-types" % "5.1.2-37262e",
  "org.scalablytyped" %%% "ts-essentials" % "9.3.0-d1d3e2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
