organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.10-1648ea"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.11-004e70",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-8ecb0c",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-330d8b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "style-value-types" % "5.1.2-26232a",
  "org.scalablytyped" %%% "ts-essentials" % "9.3.0-dbb9ea")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
