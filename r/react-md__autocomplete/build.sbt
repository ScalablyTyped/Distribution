organization := "org.scalablytyped"
name := "react-md__autocomplete"
version := "5.1.4-6d8281"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221024Z-9c1cd5",
  "org.scalablytyped" %%% "react-md__button" % "5.1.3-a63cce",
  "org.scalablytyped" %%% "react-md__form" % "5.1.4-a9b663",
  "org.scalablytyped" %%% "react-md__list" % "5.1.3-dc1511",
  "org.scalablytyped" %%% "react-md__portal" % "5.1.0-6bfa95",
  "org.scalablytyped" %%% "react-md__states" % "5.1.3-9de3e1",
  "org.scalablytyped" %%% "react-md__tooltip" % "5.1.3-518676",
  "org.scalablytyped" %%% "react-md__transition" % "5.1.3-fbb8d1",
  "org.scalablytyped" %%% "react-md__utils" % "5.1.3-7cbc72",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
