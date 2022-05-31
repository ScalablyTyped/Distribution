organization := "org.scalablytyped"
name := "rebass__forms"
version := "4.0-dt-20200925Z-b8e00f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-76fbe9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-0cfe87",
  "org.scalablytyped" %%% "rebass" % "4.0-dt-20200925Z-5e117c",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "styled-components" % "5.1-dt-20201010Z-a3c46b",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20201028Z-fc40a1",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20200925Z-9f509c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
