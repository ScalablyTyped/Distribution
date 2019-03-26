organization := "org.scalablytyped"
name := "rebass__grid"
version := "6.0-dt-20181130Z-4aa0c5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190318Z-e91587",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190223Z-f4bbf9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        