organization := "org.scalablytyped"
name := "react-md"
version := "1.9.2-4304d3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-f5e9e0",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-dcbd7c",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-65cffa",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-221490",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20180910Z-fff0e3",
  "org.scalablytyped" %%% "react-swipeable-views" % "0.12-dt-20180910Z-60172a",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-b0c8bc",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.0-7d74a3",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        