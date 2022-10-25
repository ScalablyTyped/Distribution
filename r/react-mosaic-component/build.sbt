organization := "org.scalablytyped"
name := "react-mosaic-component"
version := "5.3.0-2aabf6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blueprintjs__core" % "4.11.5-017326",
  "org.scalablytyped" %%% "blueprintjs__icons" % "4.9.0-5f1eef",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "dnd-core" % "16.0.1-2a3c56",
  "org.scalablytyped" %%% "immutability-helper" % "3.1.1-23f2ba",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-833116",
  "org.scalablytyped" %%% "popperjs__core" % "2.11.6-735837",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221024Z-9c1cd5",
  "org.scalablytyped" %%% "react-dnd" % "16.0.1-c7fe6e",
  "org.scalablytyped" %%% "react-popper" % "2.3.0-b53724",
  "org.scalablytyped" %%% "redux" % "4.2.0-6b25b9",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
