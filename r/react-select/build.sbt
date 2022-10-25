organization := "org.scalablytyped"
name := "react-select"
version := "5.5.6-890a20"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "emotion__react" % "11.10.4-cc283b",
  "org.scalablytyped" %%% "emotion__serialize" % "1.1.0-73f928",
  "org.scalablytyped" %%% "emotion__utils" % "1.2.0-86e76d",
  "org.scalablytyped" %%% "memoize-one" % "6.0.0-353932",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221024Z-9c1cd5",
  "org.scalablytyped" %%% "react-transition-group" % "4.4-dt-20220622Z-59f7cc",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
