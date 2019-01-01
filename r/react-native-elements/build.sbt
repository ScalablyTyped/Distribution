organization := "org.scalablytyped"
name := "react-native-elements"
version := "0.19.1-907e9e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-a13970",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "lodash_dot_isempty" % "4.4-dt-20180723Z-d2b59f",
  "org.scalablytyped" %%% "lodash_dot_times" % "4.3-dt-20180723Z-00d4cc",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-89199d",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-3dff88",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20181229Z-97b88f",
  "org.scalablytyped" %%% "react-native-vector-icons" % "4.6-dt-20181108Z-3c3c27",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        