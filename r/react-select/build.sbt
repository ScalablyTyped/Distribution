organization := "org.scalablytyped"
name := "react-select"
version := "5.6.1-776a2c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "emotion__react" % "11.10.5-afb80d",
  "org.scalablytyped" %%% "emotion__serialize" % "1.1.1-af6b7c",
  "org.scalablytyped" %%% "emotion__utils" % "1.2.0-e6852c",
  "org.scalablytyped" %%% "memoize-one" % "6.0.0-7d5a7d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "react-transition-group" % "4.4-dt-20220622Z-2ad706",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
