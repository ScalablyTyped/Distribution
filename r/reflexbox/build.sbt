organization := "org.scalablytyped"
name := "reflexbox"
version := "4.0-dt-20220725Z-e814a7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "emotion__react" % "11.10.5-71a84d",
  "org.scalablytyped" %%% "emotion__serialize" % "1.1.1-32908d",
  "org.scalablytyped" %%% "emotion__styled" % "11.10.4-3513dd",
  "org.scalablytyped" %%% "emotion__utils" % "1.2.0-53afd8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20220111Z-f4bb21")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
