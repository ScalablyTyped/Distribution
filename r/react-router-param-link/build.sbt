organization := "org.scalablytyped"
name := "react-router-param-link"
version := "1.0-dt-20180531Z-c9565d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-992596",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-3351b3",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190228Z-a0816d",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20190404Z-c1b7d2",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        