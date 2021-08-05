organization := "org.scalablytyped"
name := "rebass__forms"
version := "4.0-dt-20200925Z-b567ad"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-cfe100",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "react-native" % "0.63-dt-20201120Z-45fb28",
  "org.scalablytyped" %%% "rebass" % "4.0-dt-20200925Z-d92da3",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "styled-components" % "5.1-dt-20201010Z-cdd900",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20201028Z-ce4884",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20200925Z-2fe48e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
