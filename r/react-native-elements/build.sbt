organization := "org.scalablytyped"
name := "react-native-elements"
version := "1.1.0-4f8cf0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-fdb2bc",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-819a9b",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-7e7317",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-76b51b",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-f5f764",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190318Z-e91587",
  "org.scalablytyped" %%% "react-native-ratings" % "6.3.1-d64301",
  "org.scalablytyped" %%% "react-native-status-bar-height" % "2.1-dt-20181024Z-8aeec0",
  "org.scalablytyped" %%% "react-native-vector-icons" % "4.6-dt-20181108Z-5f05f0",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        