organization := "org.scalablytyped"
name := "react-themeable-ts"
version := "1.0.0-481628"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-09df87",
  "org.scalablytyped" %%% "csstype" % "2.5.8-b451f0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "lodash_dot_get" % "4.4-dt-20180910Z-01362b",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180910Z-bb472b",
  "org.scalablytyped" %%% "lodash_dot_size" % "4.2-dt-20180910Z-38cb07",
  "org.scalablytyped" %%% "memoizee" % "0.4-dt-20180910Z-16e190",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-87c4ee",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-d83ef6",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-cb7890")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        