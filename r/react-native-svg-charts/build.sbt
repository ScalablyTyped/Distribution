organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-c291ba"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180910Z-6f1148",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180910Z-320d29",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-2e1e39",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180910Z-e0fe5b",
  "org.scalablytyped" %%% "d3-scale" % "2.0-dt-20180927Z-20f1b0",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181116Z-7b0179",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180918Z-45d29a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "pegjs" % "v0.10.0-dt-20180910Z-7b8de7",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-dcbd7c",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-65cffa",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20181203Z-e0878d",
  "org.scalablytyped" %%% "react-native-svg" % "8.0.8-701b1a",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        