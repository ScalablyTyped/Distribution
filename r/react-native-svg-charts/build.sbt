organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-cd5296"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180910Z-129cf0",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180910Z-925f70",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-1e18f5",
  "org.scalablytyped" %%% "csstype" % "2.5.8-b451f0",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180910Z-b12217",
  "org.scalablytyped" %%% "d3-scale" % "2.0-dt-20180927Z-366bd0",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181116Z-52e30a",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180918Z-ae52bd",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "pegjs" % "v0.10.0-dt-20180910Z-78bd16",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-87c4ee",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-d83ef6",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20181208Z-981dfe",
  "org.scalablytyped" %%% "react-native-svg" % "8.0.9-94126c",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        