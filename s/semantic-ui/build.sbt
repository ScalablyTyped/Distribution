organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180214Z-d3680a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-1d30f0",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-59eb36",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-3c5623",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-5d3657",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-3d3d9f",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-f34835",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-e2991c",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-0115e7",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-b7943c",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-c0a4e1",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-7f7272",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-d8a0a5",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-278037",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-b41113",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-2bf54e",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-2d4ebf",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-18b6fa",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-cd3ef0",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-c75c46",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-5c1f86",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-6780d0",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-e7e832",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        