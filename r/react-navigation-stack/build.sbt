organization := "org.scalablytyped"
name := "react-navigation-stack"
version := "2.10.2-f286d8"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-45fb28",
  "org.scalablytyped" %%% "react-native-community__masked-view" % "0.1.10-d3c2ec",
  "org.scalablytyped" %%% "react-native-gesture-handler" % "1.8.0-92147f",
  "org.scalablytyped" %%% "react-native-safe-area-context" % "3.1.4-6ca0ce",
  "org.scalablytyped" %%% "react-navigation" % "4.4.3-40f406",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
