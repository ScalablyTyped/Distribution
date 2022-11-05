organization := "org.scalablytyped"
name := "react-md__menu"
version := "5.1.4-2ad3b6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-e64588",
  "org.scalablytyped" %%% "react-md__button" % "5.1.3-9d5ad4",
  "org.scalablytyped" %%% "react-md__dialog" % "5.1.3-598c13",
  "org.scalablytyped" %%% "react-md__list" % "5.1.3-7a8a4c",
  "org.scalablytyped" %%% "react-md__portal" % "5.1.0-243518",
  "org.scalablytyped" %%% "react-md__sheet" % "5.1.3-2b6dac",
  "org.scalablytyped" %%% "react-md__states" % "5.1.3-4d8627",
  "org.scalablytyped" %%% "react-md__transition" % "5.1.3-0fd866",
  "org.scalablytyped" %%% "react-md__utils" % "5.1.3-6d873f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
