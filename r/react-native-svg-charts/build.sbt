organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-b45c31"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180514Z-592800",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20181216Z-8cfa36",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190131Z-f6ea03",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180912Z-7b4468",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190206Z-d66e8f",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190205Z-4cf638",
  "org.scalablytyped" %%% "react-native-svg" % "9.2.3-da565a",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        