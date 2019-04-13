organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-93eeee"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-da6196",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-11bd50",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-7fa156",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-4fd853",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-7e744c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-5f45a9",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190410Z-71fdcd",
  "org.scalablytyped" %%% "react-native-svg" % "9.3.7-a40b21",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        