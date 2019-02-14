organization := "org.scalablytyped"
name := "react-native-elements"
version := "1.0.0-1002fd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-915a01",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-fb103b",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-048d4d",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-b656b4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-cf3a73",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20190212Z-649a6d",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20190212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190212Z-8c7663",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190212Z-f15103",
  "org.scalablytyped" %%% "react-native-ratings" % "6.3.0-a81417",
  "org.scalablytyped" %%% "react-native-status-bar-height" % "2.1-dt-20181024Z-5a8d41",
  "org.scalablytyped" %%% "react-native-vector-icons" % "4.6-dt-20181108Z-ce9012",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        