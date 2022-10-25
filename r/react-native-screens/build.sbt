organization := "org.scalablytyped"
name := "react-native-screens"
version := "3.18.2-968915"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "hammerjs" % "2.0.8-dt-20220819Z-1822f7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221024Z-9c1cd5",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-487073",
  "org.scalablytyped" %%% "react-native-gesture-handler" % "2.8.0-9054ab",
  "org.scalablytyped" %%% "react-native-reanimated" % "2.11.0-49f60c",
  "org.scalablytyped" %%% "react-native-safe-area-context" % "4.3.4-5f24db",
  "org.scalablytyped" %%% "react-navigation" % "4.4.4-c0c47e",
  "org.scalablytyped" %%% "react-navigation__core" % "6.4.0-c15e48",
  "org.scalablytyped" %%% "react-navigation__routers" % "6.1.3-37434c",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-d517a2",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
