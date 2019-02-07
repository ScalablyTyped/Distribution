organization := "org.scalablytyped"
name := "react-native-elements"
version := "1.0.0-81caf2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-bb1b70",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-dc972b",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-048d4d",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-8c061a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20180723Z-126e15",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190206Z-d66e8f",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190205Z-4cf638",
  "org.scalablytyped" %%% "react-native-ratings" % "6.3.0-c0a849",
  "org.scalablytyped" %%% "react-native-status-bar-height" % "2.1-dt-20181024Z-5a8d41",
  "org.scalablytyped" %%% "react-native-vector-icons" % "4.6-dt-20181108Z-e59aa9",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        