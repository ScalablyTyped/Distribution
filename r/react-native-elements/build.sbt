organization := "com.scalablytyped"
name := "react-native-elements"
version := "0.19.1-b4131e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-8f5757",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "lodash_dot_isempty" % "4.4-dt-20181102Z-eda660",
  "com.scalablytyped" %%% "lodash_dot_times" % "4.3-dt-20181102Z-798f9e",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20181102Z-3c49da",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-28281f",
  "com.scalablytyped" %%% "react-native" % "0.57-dt-20181116Z-71f433",
  "com.scalablytyped" %%% "react-native-vector-icons" % "4.6-dt-20181109Z-39f0d4",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        