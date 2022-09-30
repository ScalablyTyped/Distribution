organization := "org.scalablytyped"
name := "storybook__react-native"
version := "5.3.25-4e2c81"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "emotion__serialize" % "1.1.0-388cd4",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.3.0-66ac0a",
  "org.scalablytyped" %%% "emotion__utils" % "1.2.0-1ccb5c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-4e85dc",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20220927Z-e8ccda",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "storybook__addons" % "6.5.12-413c6f",
  "org.scalablytyped" %%% "storybook__api" % "6.5.12-8c8427",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.12-315b3f",
  "org.scalablytyped" %%% "storybook__client-api" % "6.5.12-2128b0",
  "org.scalablytyped" %%% "storybook__router" % "6.5.12-3609e1",
  "org.scalablytyped" %%% "storybook__store" % "6.5.12-b61e88",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.12-17779e",
  "org.scalablytyped" %%% "synchronous-promise" % "2.0.16-119edb",
  "org.scalablytyped" %%% "webpack-env" % "1.18-dt-20220816Z-b74ef9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
