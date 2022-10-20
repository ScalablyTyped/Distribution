organization := "org.scalablytyped"
name := "storybook__react-native"
version := "5.3.25-3e8630"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "emotion__serialize" % "1.1.0-a24573",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.3.0-f30e8c",
  "org.scalablytyped" %%% "emotion__utils" % "1.2.0-48b99a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-7b7723",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "storybook__addons" % "6.5.12-76d792",
  "org.scalablytyped" %%% "storybook__api" % "6.5.12-0820b1",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.12-711db2",
  "org.scalablytyped" %%% "storybook__client-api" % "6.5.12-94ce3d",
  "org.scalablytyped" %%% "storybook__router" % "6.5.12-07db7c",
  "org.scalablytyped" %%% "storybook__store" % "6.5.12-949a9f",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.12-de6667",
  "org.scalablytyped" %%% "synchronous-promise" % "2.0.16-44f8b1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
