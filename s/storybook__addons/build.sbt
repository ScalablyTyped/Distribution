organization := "org.scalablytyped"
name := "storybook__addons"
version := "6.5.12-767122"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "storybook__api" % "6.5.12-1398a6",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.12-b864cb",
  "org.scalablytyped" %%% "storybook__router" % "6.5.12-0885eb",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.12-55437e",
  "org.scalablytyped" %%% "webpack-env" % "1.18-dt-20220816Z-f15ccb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
