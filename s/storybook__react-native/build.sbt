organization := "org.scalablytyped"
name := "storybook__react-native"
version := "5.3.27-d98267"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "emotion__serialize" % "1.1.1-039de7",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.3.0-e98eae",
  "org.scalablytyped" %%% "emotion__utils" % "1.2.0-86e76d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-e64588",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-3962e1",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "storybook__addons" % "6.5.13-3c764e",
  "org.scalablytyped" %%% "storybook__api" % "6.5.13-ae4414",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.13-52db1d",
  "org.scalablytyped" %%% "storybook__client-api" % "6.5.13-d608cc",
  "org.scalablytyped" %%% "storybook__router" % "6.5.13-7399d5",
  "org.scalablytyped" %%% "storybook__store" % "6.5.13-c14660",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.13-497661",
  "org.scalablytyped" %%% "synchronous-promise" % "2.0.16-8f4fff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
