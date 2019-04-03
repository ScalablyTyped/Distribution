organization := "org.scalablytyped"
name := "react-native-elements"
version := "1.1.0-a8069c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-c3a447",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-c88cd1",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-5a34a6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-a1baa5",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-ee4549",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190329Z-407a4c",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190327Z-351457",
  "org.scalablytyped" %%% "react-native-ratings" % "6.3.1-56e26d",
  "org.scalablytyped" %%% "react-native-status-bar-height" % "2.1-dt-20181024Z-5cf51c",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20190401Z-9951e9",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        