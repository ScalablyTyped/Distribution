organization := "org.scalablytyped"
name := "rebass"
version := "3.0-dt-20190212Z-ed231a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-60f3ea",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190306Z-d5c6e1",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-704df6",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190223Z-91a154",
  "org.scalablytyped" %%% "styled-system" % "3.2-dt-20190213Z-417a06")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        