organization := "org.scalablytyped"
name := "react-native-elements"
version := "1.1.0-a27ffa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-cbf741",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-8d0037",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-1a1d0f",
  "org.scalablytyped" %%% "csstype" % "2.6.2-49af40",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-065978",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-4c89f3",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-2e7712",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-7328c8",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-a8323e",
  "org.scalablytyped" %%% "react-native-ratings" % "6.3.0-8cf8a8",
  "org.scalablytyped" %%% "react-native-status-bar-height" % "2.1-dt-20181024Z-6e015a",
  "org.scalablytyped" %%% "react-native-vector-icons" % "4.6-dt-20181108Z-4c053d",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        