organization := "org.scalablytyped"
name := "storybook__theming"
version := "5.0.6-2ac7e0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181205Z-1fedc3",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-aa40e6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "deep-object-diff" % "1.1.0-c47466",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.10-2fa0a6",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.9-f9412f",
  "org.scalablytyped" %%% "emotion__core" % "10.0.10-132c15",
  "org.scalablytyped" %%% "emotion__css" % "10.0.9-7ce425",
  "org.scalablytyped" %%% "emotion__is-prop-valid" % "0.7.3-3c4406",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-2ffa70",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-a7f9c3",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.10-5740ed",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.10-f62b07",
  "org.scalablytyped" %%% "emotion__stylis" % "0.8.3-4bdcd9",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-255ee0",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-69d728",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20190214Z-6b1c7f",
  "org.scalablytyped" %%% "lodash_dot_mergewith" % "4.6-dt-20190214Z-b2ffcd",
  "org.scalablytyped" %%% "memoizerific" % "1.11.3-512dd8",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20190322Z-d95386",
  "org.scalablytyped" %%% "polished" % "2.3.3-5430b2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-3351b3",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190411Z-db2943",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "storybook__client-logger" % "5.0.6-7a043b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        