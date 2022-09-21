organization := "org.scalablytyped"
name := "react-md__autocomplete"
version := "5.1.4-c61ca8"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "react-md__button" % "5.1.3-9d9270",
  "org.scalablytyped" %%% "react-md__form" % "5.1.4-80c72d",
  "org.scalablytyped" %%% "react-md__list" % "5.1.3-9ea5d7",
  "org.scalablytyped" %%% "react-md__portal" % "5.1.0-b16e54",
  "org.scalablytyped" %%% "react-md__states" % "5.1.3-2deaae",
  "org.scalablytyped" %%% "react-md__tooltip" % "5.1.3-26646c",
  "org.scalablytyped" %%% "react-md__transition" % "5.1.3-d8eb52",
  "org.scalablytyped" %%% "react-md__utils" % "5.1.3-7e5645",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
