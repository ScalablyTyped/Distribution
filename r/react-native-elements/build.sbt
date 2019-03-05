organization := "org.scalablytyped"
name := "react-native-elements"
version := "1.1.0-832cda"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-cbf741",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-8d0037",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-1a1d0f",
  "org.scalablytyped" %%% "csstype" % "2.6.3-60f3ea",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-065978",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-80b212",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-f7f3c1",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-ce30a6",
  "org.scalablytyped" %%% "react-native-ratings" % "6.3.0-42811c",
  "org.scalablytyped" %%% "react-native-status-bar-height" % "2.1-dt-20181024Z-6e015a",
  "org.scalablytyped" %%% "react-native-vector-icons" % "4.6-dt-20181108Z-5122fa",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        