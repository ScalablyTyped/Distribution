organization := "org.scalablytyped"
name := "react-md__menu"
version := "5.1.4-f5577c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-16e74e",
  "org.scalablytyped" %%% "react-md__button" % "5.1.3-03f070",
  "org.scalablytyped" %%% "react-md__dialog" % "5.1.3-ae0239",
  "org.scalablytyped" %%% "react-md__list" % "5.1.3-2aa2e1",
  "org.scalablytyped" %%% "react-md__portal" % "5.1.0-5227e5",
  "org.scalablytyped" %%% "react-md__sheet" % "5.1.3-44b1de",
  "org.scalablytyped" %%% "react-md__states" % "5.1.3-09d07b",
  "org.scalablytyped" %%% "react-md__transition" % "5.1.3-3c1ea6",
  "org.scalablytyped" %%% "react-md__utils" % "5.1.3-8930c5",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
