organization := "org.scalablytyped"
name := "react-md"
version := "1.10.0-b031f4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190326Z-9fc905",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-3351b3",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190411Z-db2943",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20190322Z-f6d272",
  "org.scalablytyped" %%% "react-swipeable-views" % "0.13-dt-20190221Z-90ab35",
  "org.scalablytyped" %%% "react-transition-group" % "2.9-dt-20190409Z-591e88",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-d41765",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        