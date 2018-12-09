organization := "org.scalablytyped"
name := "react-md"
version := "1.9.2-487354"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-09df87",
  "org.scalablytyped" %%% "csstype" % "2.5.8-b451f0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-87c4ee",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-d83ef6",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-d04ae5",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20180910Z-2d863d",
  "org.scalablytyped" %%% "react-swipeable-views" % "0.12-dt-20180910Z-e3f4e0",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-65045f",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-36069e",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        