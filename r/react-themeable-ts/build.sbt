organization := "org.scalablytyped"
name := "react-themeable-ts"
version := "1.0.0-0e7451"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190325Z-43290b",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "lodash_dot_get" % "4.4-dt-20190214Z-2c7878",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20190214Z-55274c",
  "org.scalablytyped" %%% "lodash_dot_size" % "4.2-dt-20190214Z-e510cd",
  "org.scalablytyped" %%% "memoizee" % "0.4-dt-20180214Z-6bc800",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "tslib" % "1.9.3-f320f9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        