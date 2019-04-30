organization := "org.scalablytyped"
name := "rebass__grid"
version := "6.0-dt-20190403Z-a58435"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-7e744c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-caf3c8",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190429Z-023944",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190408Z-76b8e4",
  "org.scalablytyped" %%% "styled-system" % "4.1-dt-20190426Z-aaa678")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        