organization := "org.scalablytyped"
name := "react-select"
version := "5.6.0-c3caca"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "emotion__react" % "11.10.5-fa1dab",
  "org.scalablytyped" %%% "emotion__serialize" % "1.1.1-039de7",
  "org.scalablytyped" %%% "emotion__utils" % "1.2.0-86e76d",
  "org.scalablytyped" %%% "memoize-one" % "6.0.0-353932",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221027Z-1a0a13",
  "org.scalablytyped" %%% "react-transition-group" % "4.4-dt-20220622Z-5cfd0b",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
