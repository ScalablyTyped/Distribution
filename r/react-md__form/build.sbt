organization := "org.scalablytyped"
name := "react-md__form"
version := "5.1.4-1b201d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "react-md__button" % "5.1.3-ddd21f",
  "org.scalablytyped" %%% "react-md__list" % "5.1.3-a8c5ce",
  "org.scalablytyped" %%% "react-md__portal" % "5.1.0-59f187",
  "org.scalablytyped" %%% "react-md__states" % "5.1.3-d75415",
  "org.scalablytyped" %%% "react-md__tooltip" % "5.1.3-951238",
  "org.scalablytyped" %%% "react-md__transition" % "5.1.3-3a372e",
  "org.scalablytyped" %%% "react-md__utils" % "5.1.3-7fd37f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
