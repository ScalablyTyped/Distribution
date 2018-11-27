organization := "com.scalablytyped"
name := "react-md"
version := "1.8.0-483989"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-d7884f",
  "com.scalablytyped" %%% "csstype" % "2.5.7-eccde3",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-7b533e",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181122Z-2ddd12",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-3e11f7",
  "com.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20180910Z-e319c6",
  "com.scalablytyped" %%% "react-swipeable-views" % "0.12-dt-20180910Z-ff0672",
  "com.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-b9d453",
  "com.scalablytyped" %%% "resize-observer-polyfill" % "1.5.0-b0d431",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        