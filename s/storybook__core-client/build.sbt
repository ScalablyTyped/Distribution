organization := "org.scalablytyped"
name := "storybook__core-client"
version := "6.5.13-512b09"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-fa36ba",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "storybook__addons" % "6.5.13-1b00d0",
  "org.scalablytyped" %%% "storybook__api" % "6.5.13-285ea3",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.13-d6ee9f",
  "org.scalablytyped" %%% "storybook__client-api" % "6.5.13-72c32c",
  "org.scalablytyped" %%% "storybook__router" % "6.5.13-0db450",
  "org.scalablytyped" %%% "storybook__store" % "6.5.13-38f278",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.13-d1c993",
  "org.scalablytyped" %%% "storybook__ui" % "6.5.13-c3c65a",
  "org.scalablytyped" %%% "synchronous-promise" % "2.0.16-2058ec")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
