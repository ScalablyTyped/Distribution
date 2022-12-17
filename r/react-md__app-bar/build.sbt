organization := "org.scalablytyped"
name := "react-md__app-bar"
version := "5.1.3-beac74"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "react-md__button" % "5.1.3-2d76b3",
  "org.scalablytyped" %%% "react-md__portal" % "5.1.0-0fa4e4",
  "org.scalablytyped" %%% "react-md__states" % "5.1.3-c4d781",
  "org.scalablytyped" %%% "react-md__transition" % "5.1.3-f36607",
  "org.scalablytyped" %%% "react-md__utils" % "5.1.3-987da7",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
