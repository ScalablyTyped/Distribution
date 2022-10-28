organization := "org.scalablytyped"
name := "react-md__autocomplete"
version := "5.1.4-002a79"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221027Z-1a0a13",
  "org.scalablytyped" %%% "react-md__button" % "5.1.3-069d51",
  "org.scalablytyped" %%% "react-md__form" % "5.1.4-2fca27",
  "org.scalablytyped" %%% "react-md__list" % "5.1.3-cb41e4",
  "org.scalablytyped" %%% "react-md__portal" % "5.1.0-49e029",
  "org.scalablytyped" %%% "react-md__states" % "5.1.3-01f67c",
  "org.scalablytyped" %%% "react-md__tooltip" % "5.1.3-252137",
  "org.scalablytyped" %%% "react-md__transition" % "5.1.3-aca32f",
  "org.scalablytyped" %%% "react-md__utils" % "5.1.3-1a5486",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
