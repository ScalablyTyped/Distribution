organization := "org.scalablytyped"
name := "react-md__menu"
version := "2.4.3-964336"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-md__app-bar" % "2.4.2-d29c4a",
  "org.scalablytyped" %%% "react-md__button" % "2.4.2-56ea0d",
  "org.scalablytyped" %%% "react-md__divider" % "2.4.2-084972",
  "org.scalablytyped" %%% "react-md__list" % "2.4.3-7d389c",
  "org.scalablytyped" %%% "react-md__portal" % "2.4.2-bb420c",
  "org.scalablytyped" %%% "react-md__states" % "2.4.2-fc3ba6",
  "org.scalablytyped" %%% "react-md__transition" % "2.4.2-598278",
  "org.scalablytyped" %%% "react-md__utils" % "2.4.2-2b7260",
  "org.scalablytyped" %%% "react-transition-group" % "4.4-dt-20200521Z-286edc",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
