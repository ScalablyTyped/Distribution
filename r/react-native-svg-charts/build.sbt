organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-5d1f31"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180514Z-e952c4",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20181216Z-b733c5",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20190110Z-a62c76",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180912Z-94d0f8",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190131Z-997ec6",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190130Z-917d0a",
  "org.scalablytyped" %%% "react-native-svg" % "9.1.1-d8821b",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        