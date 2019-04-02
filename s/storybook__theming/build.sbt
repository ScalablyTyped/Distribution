organization := "org.scalablytyped"
name := "storybook__theming"
version := "5.0.6-88ee9f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181205Z-1fedc3",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-0940d0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "deep-object-diff" % "1.1.0-c47466",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.10-eff5d3",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.9-2203ad",
  "org.scalablytyped" %%% "emotion__core" % "10.0.10-0f0773",
  "org.scalablytyped" %%% "emotion__css" % "10.0.9-7ce425",
  "org.scalablytyped" %%% "emotion__is-prop-valid" % "0.7.3-3c4406",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-2ffa70",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-a7f9c3",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.10-a2ef04",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.10-628762",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-255ee0",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-ee4549",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190329Z-69a948",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20190214Z-c3cf18",
  "org.scalablytyped" %%% "lodash_dot_mergewith" % "4.6-dt-20190214Z-f0154f",
  "org.scalablytyped" %%% "memoizerific" % "1.11.3-512dd8",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20190322Z-d95386",
  "org.scalablytyped" %%% "polished" % "2.3.3-5430b2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190329Z-407a4c",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-348bcf",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "storybook__client-logger" % "5.0.6-c9af9b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        