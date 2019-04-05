organization := "org.scalablytyped"
name := "react-virtualized-select"
version := "3.0-dt-20180802Z-5a6725"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-d8f967",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-9aa93f",
  "org.scalablytyped" %%% "react-select" % "2.0-dt-20190313Z-46d36f",
  "org.scalablytyped" %%% "react-transition-group" % "2.8-dt-20190404Z-861001",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190403Z-a0d8c7",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        