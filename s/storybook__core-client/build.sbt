organization := "org.scalablytyped"
name := "storybook__core-client"
version := "6.5.13-1c78b5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221024Z-9c1cd5",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "storybook__addons" % "6.5.13-7ced10",
  "org.scalablytyped" %%% "storybook__api" % "6.5.13-966e73",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.13-52db1d",
  "org.scalablytyped" %%% "storybook__client-api" % "6.5.13-6e6f04",
  "org.scalablytyped" %%% "storybook__router" % "6.5.13-6f7d0b",
  "org.scalablytyped" %%% "storybook__store" % "6.5.13-a6e825",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.13-19baf3",
  "org.scalablytyped" %%% "storybook__ui" % "6.5.13-df6191",
  "org.scalablytyped" %%% "synchronous-promise" % "2.0.16-8f4fff")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
