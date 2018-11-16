organization := "com.scalablytyped"
name := "react-themeable-ts"
version := "1.0.0-d77135"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20181102Z-4c332c",
  "com.scalablytyped" %%% "csstype" % "2.5.7-8f5757",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "lodash_dot_get" % "4.4-dt-20181102Z-baed91",
  "com.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20181102Z-413d4e",
  "com.scalablytyped" %%% "lodash_dot_size" % "4.2-dt-20181102Z-f47f9f",
  "com.scalablytyped" %%% "memoizee" % "0.4-dt-20181102Z-5b4d41",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20181102Z-3c49da",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-28281f",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "tslib" % "1.9.3-89a8f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        