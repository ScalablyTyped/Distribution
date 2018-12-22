organization := "org.scalablytyped"
name := "react-md"
version := "1.9.2-2d7f5d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180721Z-d403a0",
  "org.scalablytyped" %%% "csstype" % "2.5.8-28635b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-3109dd",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-b38950",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-d008b6",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20180806Z-9b41bc",
  "org.scalablytyped" %%% "react-swipeable-views" % "0.12-dt-20180806Z-5ebe3e",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-cbde35",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-bfad26",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        