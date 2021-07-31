organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20201104Z-5a77d0"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "d3-path" % "2.0-dt-20201002Z-1156c5",
  "org.scalablytyped" %%% "d3-scale" % "3.2-dt-20201104Z-e6650a",
  "org.scalablytyped" %%% "d3-shape" % "2.0-dt-20201028Z-f64cca",
  "org.scalablytyped" %%% "d3-time" % "2.0-dt-20201002Z-ab0101",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-adb02e",
  "org.scalablytyped" %%% "react-native-svg" % "12.1.0-acb926",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
