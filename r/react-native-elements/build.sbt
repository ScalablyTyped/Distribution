organization := "org.scalablytyped"
name := "react-native-elements"
version := "3.0.0-alpha.1-ddb829"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-adb02e",
  "org.scalablytyped" %%% "react-native-ratings" % "7.3.0-dbb51b",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20200918Z-84376c",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
