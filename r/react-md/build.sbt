organization := "com.scalablytyped"
name := "react-md"
version := "1.8.0-04faad"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20181102Z-4c332c",
  "com.scalablytyped" %%% "csstype" % "2.5.7-8f5757",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20181102Z-3c49da",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-28281f",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181102Z-1c0420",
  "com.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20181102Z-302300",
  "com.scalablytyped" %%% "react-swipeable-views" % "0.12-dt-20181102Z-8fa722",
  "com.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181102Z-338645",
  "com.scalablytyped" %%% "resize-observer-polyfill" % "1.5.0-0c9a0a",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        