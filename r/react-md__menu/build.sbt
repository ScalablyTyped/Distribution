organization := "org.scalablytyped"
name := "react-md__menu"
version := "5.1.4-ec27f6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "react-md__button" % "5.1.3-f22d36",
  "org.scalablytyped" %%% "react-md__dialog" % "5.1.3-1ba5b6",
  "org.scalablytyped" %%% "react-md__list" % "5.1.3-d72fc9",
  "org.scalablytyped" %%% "react-md__portal" % "5.1.0-32345e",
  "org.scalablytyped" %%% "react-md__sheet" % "5.1.3-19ce67",
  "org.scalablytyped" %%% "react-md__states" % "5.1.3-0a087e",
  "org.scalablytyped" %%% "react-md__transition" % "5.1.3-db0d2b",
  "org.scalablytyped" %%% "react-md__utils" % "5.1.3-d98296",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
