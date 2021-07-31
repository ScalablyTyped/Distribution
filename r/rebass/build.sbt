organization := "org.scalablytyped"
name := "rebass"
version := "4.0-dt-20200925Z-f910bd"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-62515f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-adb02e",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "styled-components" % "5.1-dt-20201010Z-09dd0a",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20201028Z-23bda0",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20200925Z-a8508f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
