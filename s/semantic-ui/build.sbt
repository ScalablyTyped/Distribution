organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180214Z-bed339"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-f7f24f",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-fa164c",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-f5e5e5",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-bf2893",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-3505bc",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-64faf4",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-46eedb",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-06a173",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-992bfc",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-c7c2fb",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-cc882a",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-5f6872",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-61952f",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-bac1f6",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-55207b",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-31570a",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-5a86ce",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-ca438f",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-e9902c",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-b52c0d",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-5e0886",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-b20ceb",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        