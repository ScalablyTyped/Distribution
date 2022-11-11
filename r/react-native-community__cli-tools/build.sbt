organization := "org.scalablytyped"
name := "react-native-community__cli-tools"
version := "9.2.1-abf1f4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cli-spinners" % "2.7.0-eeb0a2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-975c5a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "node-fetch" % "3.3.0-d782a8",
  "org.scalablytyped" %%% "ora" % "6.1.2-f167fe",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
