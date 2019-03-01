organization := "org.scalablytyped"
name := "react-native-elements"
version := "1.1.0-bb5c19"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-1c6acb",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-8aa3de",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-c289fb",
  "org.scalablytyped" %%% "csstype" % "2.6.2-481742",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-2ccfe4",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-8c5ec1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-66c044",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-9e9d73",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-280c3d",
  "org.scalablytyped" %%% "react-native-ratings" % "6.3.0-bea216",
  "org.scalablytyped" %%% "react-native-status-bar-height" % "2.1-dt-20181024Z-d7b136",
  "org.scalablytyped" %%% "react-native-vector-icons" % "4.6-dt-20181108Z-614863",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        