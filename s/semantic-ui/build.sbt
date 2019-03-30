organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20190212Z-124d88"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-6565a2",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-be1bba",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-c08e19",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-f9eb8f",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-1f70f3",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-66c7f0",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-73bd64",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-942351",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-d5ba92",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-58908b",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-df4015",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-e27a9f",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-66922f",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-95be09",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-06f8c3",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-739fe3",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-105133",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-eae1c9",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-550df2",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-a0058a",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-2335ff",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-cab61f",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        