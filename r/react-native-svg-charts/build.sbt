organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-f1d481"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-38121a",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-825ab7",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-a59bb2",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-d8b54d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190329Z-407a4c",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190327Z-351457",
  "org.scalablytyped" %%% "react-native-svg" % "9.3.6-a392ea",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        