organization := "org.scalablytyped"
name := "react-native-elements"
version := "3.4.2-13e49f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "color" % "3.0-dt-20220819Z-9bbec5",
  "org.scalablytyped" %%% "color-convert" % "2.0-dt-20211202Z-c34c4c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20211202Z-d769f2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-041ba4",
  "org.scalablytyped" %%% "react-native-ratings" % "8.1.0-f4b65b",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20220830Z-ff4620",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
