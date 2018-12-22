organization := "org.scalablytyped"
name := "react-themeable-ts"
version := "1.0.0-3e8dd5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180721Z-d403a0",
  "org.scalablytyped" %%% "csstype" % "2.5.8-28635b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "lodash_dot_get" % "4.4-dt-20180723Z-8162d8",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180723Z-9b6b5b",
  "org.scalablytyped" %%% "lodash_dot_size" % "4.2-dt-20180723Z-025d1c",
  "org.scalablytyped" %%% "memoizee" % "0.4-dt-20180214Z-3ae960",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-3109dd",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-b38950",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "tslib" % "1.9.3-417c1f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        