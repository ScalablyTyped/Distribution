organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-158a5f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-3cd03b",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-f6043f",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-633954",
  "org.scalablytyped" %%% "csstype" % "2.5.8-28635b",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180514Z-b7d80f",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20181216Z-5ea1da",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181208Z-1a625c",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180912Z-752cae",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "pegjs" % "v0.10.0-dt-20180522Z-644013",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-3109dd",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-b38950",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20181224Z-252615",
  "org.scalablytyped" %%% "react-native-svg" % "8.0.10-fd6a4b",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        