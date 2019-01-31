organization := "org.scalablytyped"
name := "react-native-elements"
version := "1.0.0-339d4e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-b427bd",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-1b682d",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-de46de",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-25c871",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "lodash_dot_merge" % "4.6-dt-20180723Z-a69dc5",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190131Z-997ec6",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190130Z-917d0a",
  "org.scalablytyped" %%% "react-native-ratings" % "6.3.0-a53152",
  "org.scalablytyped" %%% "react-native-status-bar-height" % "2.1-dt-20181024Z-0d5f2c",
  "org.scalablytyped" %%% "react-native-vector-icons" % "4.6-dt-20181108Z-b3d307",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        