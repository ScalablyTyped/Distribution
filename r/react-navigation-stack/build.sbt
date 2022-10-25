organization := "org.scalablytyped"
name := "react-navigation-stack"
version := "2.10.4-4d8a95"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "hammerjs" % "2.0.8-dt-20220819Z-1822f7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221024Z-9c1cd5",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-487073",
  "org.scalablytyped" %%% "react-native-community__masked-view" % "0.1.11-8e4b2b",
  "org.scalablytyped" %%% "react-native-gesture-handler" % "2.8.0-9054ab",
  "org.scalablytyped" %%% "react-native-safe-area-context" % "4.3.4-5f24db",
  "org.scalablytyped" %%% "react-navigation" % "4.4.4-c0c47e",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-d517a2",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
