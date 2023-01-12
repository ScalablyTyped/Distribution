organization := "org.scalablytyped"
name := "react-mosaic-component"
version := "5.3.0-bb6a2c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "blueprintjs__core" % "4.12.0-3febed",
  "org.scalablytyped" %%% "blueprintjs__icons" % "4.10.1-aa8dd4",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "dnd-core" % "16.0.1-d2ce2c",
  "org.scalablytyped" %%% "immutability-helper" % "3.1.1-8de0d8",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-da4a64",
  "org.scalablytyped" %%% "popperjs__core" % "2.11.6-80da9b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "react-dnd" % "16.0.1-408af3",
  "org.scalablytyped" %%% "react-popper" % "2.3.0-5a9a74",
  "org.scalablytyped" %%% "redux" % "4.2.0-17c5bf",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
