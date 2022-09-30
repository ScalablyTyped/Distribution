organization := "org.scalablytyped"
name := "react-native-screens"
version := "3.17.0-bf6c2c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "hammerjs" % "2.0.8-dt-20220819Z-da1d63",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20220927Z-e8ccda",
  "org.scalablytyped" %%% "react-native-gesture-handler" % "2.6.2-cfa206",
  "org.scalablytyped" %%% "react-native-reanimated" % "2.10.0-6c9037",
  "org.scalablytyped" %%% "react-native-safe-area-context" % "4.3.4-f60063",
  "org.scalablytyped" %%% "react-navigation" % "4.4.4-1c9a24",
  "org.scalablytyped" %%% "react-navigation__core" % "6.4.0-29b973",
  "org.scalablytyped" %%% "react-navigation__routers" % "6.1.3-18ee5f",
  "org.scalablytyped" %%% "react-test-renderer" % "18.0-dt-20220805Z-1f8014",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
