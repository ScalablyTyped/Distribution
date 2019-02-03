organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180214Z-386fb1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-7adbea",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-36b02e",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-c3d096",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-90eaab",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-b3bed0",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-bdf153",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-79be5c",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-71164e",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-6b6968",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-036339",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-61c969",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-d15cb0",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-8b7eba",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-05dba8",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-d858bb",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-909751",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-87e5f4",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-fa2af8",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-e55c54",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-a81125",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-d44e0b",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-b13b7f",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        