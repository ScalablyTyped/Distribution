organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-697b87"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-2064c6",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-ab03b2",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-528543",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180514Z-2dd015",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20181216Z-9957d3",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181208Z-21834e",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180912Z-6f62fe",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "pegjs" % "v0.10.0-dt-20180522Z-a45dbe",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-e34099",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190108Z-90d027",
  "org.scalablytyped" %%% "react-native-svg" % "8.0.10-da0db4",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        