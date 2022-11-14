organization := "org.scalablytyped"
name := "storybook__preact"
version := "6.5.13-a99597"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "preact" % "10.11.3-4113af",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "storybook__addons" % "6.5.13-e97159",
  "org.scalablytyped" %%% "storybook__api" % "6.5.13-a7e1bc",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.13-cdee5b",
  "org.scalablytyped" %%% "storybook__router" % "6.5.13-c8dd79",
  "org.scalablytyped" %%% "storybook__store" % "6.5.13-158d09",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.13-024f3c",
  "org.scalablytyped" %%% "synchronous-promise" % "2.0.16-da258c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
