organization := "org.scalablytyped"
name := "storybook__react-native"
version := "5.3.27-8c0dfe"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "emotion__serialize" % "1.1.1-ef7f00",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.3.0-f01676",
  "org.scalablytyped" %%% "emotion__utils" % "1.2.0-42f3cd",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-625bd0",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-27f111",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "storybook__addons" % "6.5.13-ac12e6",
  "org.scalablytyped" %%% "storybook__api" % "6.5.13-fbd00a",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.13-a03a14",
  "org.scalablytyped" %%% "storybook__client-api" % "6.5.13-1ddeac",
  "org.scalablytyped" %%% "storybook__router" % "6.5.13-35e220",
  "org.scalablytyped" %%% "storybook__store" % "6.5.13-754a53",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.13-7c9926",
  "org.scalablytyped" %%% "synchronous-promise" % "2.0.16-330023")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
