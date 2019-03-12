organization := "org.scalablytyped"
name := "react-native-elements"
version := "1.1.0-545d62"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-ecccef",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-934592",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1b784",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9f8404",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-4b2fad",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-7f8230",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190306Z-24375e",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-7680fd",
  "org.scalablytyped" %%% "react-native-ratings" % "6.3.0-f58c00",
  "org.scalablytyped" %%% "react-native-status-bar-height" % "2.1-dt-20181024Z-369211",
  "org.scalablytyped" %%% "react-native-vector-icons" % "4.6-dt-20181108Z-112ad7",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        