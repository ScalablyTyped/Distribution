organization := "org.scalablytyped"
name := "storybook__addon-knobs"
version := "6.1.2-886b56"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "emotion__core" % "10.1.1-c9baa4",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-930fda",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-a869bd",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.31-1c0db7",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-2a6db3",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20201002Z-6d86d0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200925Z-be04c0",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "storybook__api" % "6.1.2-98a82f",
  "org.scalablytyped" %%% "storybook__channels" % "6.1.2-41d921",
  "org.scalablytyped" %%% "storybook__router" % "6.1.2-53ae6c",
  "org.scalablytyped" %%% "storybook__theming" % "6.1.2-635907")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
