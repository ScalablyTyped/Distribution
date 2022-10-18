organization := "org.scalablytyped"
name := "react-navigation-stack"
version := "2.10.4-93f96c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "hammerjs" % "2.0.8-dt-20220819Z-a0e65e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221016Z-c1c8c7",
  "org.scalablytyped" %%% "react-native-community__masked-view" % "0.1.11-5e349b",
  "org.scalablytyped" %%% "react-native-gesture-handler" % "2.7.1-36cd52",
  "org.scalablytyped" %%% "react-native-safe-area-context" % "4.3.4-76de3d",
  "org.scalablytyped" %%% "react-navigation" % "4.4.4-989ebf",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-dc4815",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
