organization := "com.scalablytyped"
name := "react-themeable-ts"
version := "1.0.0-4ad543"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-d2b0a8",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-0335c2",
  "com.scalablytyped" %%% "lodash_dot_get" % "4.4-dt-20180910Z-0ae9ad",
  "com.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180910Z-7c8f27",
  "com.scalablytyped" %%% "lodash_dot_size" % "4.2-dt-20180910Z-d8b2d2",
  "com.scalablytyped" %%% "memoizee" % "0.4-dt-20180910Z-bee54e",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181203Z-843f9f",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tslib" % "1.9.3-9baf35",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        