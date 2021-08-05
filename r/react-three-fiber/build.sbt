organization := "org.scalablytyped"
name := "react-three-fiber"
version := "5.3.1-3e3d20"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-45fb28",
  "org.scalablytyped" %%% "react-reconciler" % "0.18-dt-20190109Z-c5d877",
  "org.scalablytyped" %%% "react-use-measure" % "2.0.3-aea0eb",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "three" % "0.122.0-fae577",
  "org.scalablytyped" %%% "tiny-emitter" % "2.1.0-0e6cac")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
