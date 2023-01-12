organization := "org.scalablytyped"
name := "react-select"
version := "5.6.1-a339c6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "emotion__react" % "11.10.5-077e7e",
  "org.scalablytyped" %%% "emotion__serialize" % "1.1.1-ef7f00",
  "org.scalablytyped" %%% "emotion__utils" % "1.2.0-42f3cd",
  "org.scalablytyped" %%% "memoize-one" % "6.0.0-c495db",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "react-transition-group" % "4.4-dt-20220622Z-8a14d2",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
