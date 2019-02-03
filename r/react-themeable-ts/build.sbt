organization := "org.scalablytyped"
name := "react-themeable-ts"
version := "1.0.0-6237cc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-df7a56",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "lodash_dot_get" % "4.4-dt-20180723Z-708940",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180723Z-ec2659",
  "org.scalablytyped" %%% "lodash_dot_size" % "4.2-dt-20180723Z-cb08de",
  "org.scalablytyped" %%% "memoizee" % "0.4-dt-20180214Z-2eff68",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-f7085e",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tslib" % "1.9.3-2d26d9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        