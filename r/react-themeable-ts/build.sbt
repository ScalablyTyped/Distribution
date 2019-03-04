organization := "org.scalablytyped"
name := "react-themeable-ts"
version := "1.0.0-2b7f38"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-3f1c68",
  "org.scalablytyped" %%% "csstype" % "2.6.2-49af40",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-2e7712",
  "org.scalablytyped" %%% "lodash_dot_get" % "4.4-dt-20190212Z-c3ae47",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20190212Z-d3367b",
  "org.scalablytyped" %%% "lodash_dot_size" % "4.2-dt-20190212Z-50388a",
  "org.scalablytyped" %%% "memoizee" % "0.4-dt-20180214Z-2f71f6",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-7328c8",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        