organization := "org.scalablytyped"
name := "react-themeable-ts"
version := "1.0.0-acbc5d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-f5e9e0",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "lodash_dot_get" % "4.4-dt-20180910Z-781514",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180910Z-ea61ab",
  "org.scalablytyped" %%% "lodash_dot_size" % "4.2-dt-20180910Z-72e888",
  "org.scalablytyped" %%% "memoizee" % "0.4-dt-20180910Z-99266d",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-dcbd7c",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-65cffa",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6146fe")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        