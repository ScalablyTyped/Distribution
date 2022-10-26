organization := "org.scalablytyped"
name := "react-native-elements"
version := "3.4.2-6a4a5d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "color" % "3.0-dt-20220819Z-b8ff90",
  "org.scalablytyped" %%% "color-convert" % "2.0-dt-20211202Z-7c7c1a",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20211202Z-135be1",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221025Z-ca420a",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-0a69be",
  "org.scalablytyped" %%% "react-native-ratings" % "8.1.0-ae1f00",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20220830Z-8ee8b7",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
