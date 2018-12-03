organization := "com.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-499972"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "color" % "3.0-dt-20180910Z-0518fc",
  "com.scalablytyped" %%% "color-convert" % "1.9-dt-20180910Z-b5b898",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-20e4ae",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "d3-path" % "1.0-dt-20180910Z-a4e217",
  "com.scalablytyped" %%% "d3-scale" % "2.0-dt-20180927Z-909ef0",
  "com.scalablytyped" %%% "d3-shape" % "1.2-dt-20181116Z-b7d83a",
  "com.scalablytyped" %%% "d3-time" % "1.0-dt-20180918Z-242d7c",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-aa3127",
  "com.scalablytyped" %%% "pegjs" % "v0.10.0-dt-20180910Z-c7da73",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181203Z-843f9f",
  "com.scalablytyped" %%% "react-native" % "0.57-dt-20181203Z-efa953",
  "com.scalablytyped" %%% "react-native-svg" % "8.0.8-93cb91",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        