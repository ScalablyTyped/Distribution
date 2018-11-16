organization := "com.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181109Z-0d70a6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "color" % "3.0-dt-20181102Z-291104",
  "com.scalablytyped" %%% "color-convert" % "1.9-dt-20181102Z-482d3c",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20181102Z-8ba882",
  "com.scalablytyped" %%% "csstype" % "2.5.7-8f5757",
  "com.scalablytyped" %%% "d3-path" % "1.0-dt-20181102Z-4d199e",
  "com.scalablytyped" %%% "d3-scale" % "2.0-dt-20181102Z-1bd164",
  "com.scalablytyped" %%% "d3-shape" % "1.2-dt-20181116Z-dbee18",
  "com.scalablytyped" %%% "d3-time" % "1.0-dt-20181102Z-cc98f0",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "pegjs" % "v0.10.0-dt-20181102Z-474850",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20181102Z-3c49da",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-28281f",
  "com.scalablytyped" %%% "react-native" % "0.57-dt-20181116Z-71f433",
  "com.scalablytyped" %%% "react-native-svg" % "8.0.8-7075fb",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        