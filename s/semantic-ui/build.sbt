organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180214Z-529e1d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-4c60fb",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-13b8be",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-978c69",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-76c8b7",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-51078f",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-2d833c",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-1224f4",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-adf039",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-8bd497",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-9d6020",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-54ea76",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-45f701",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-9ca158",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-f2a3dc",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-372448",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-f9b514",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-a80ea5",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-c1062b",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-3bd91c",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-d00f4f",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-d94638",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-94c7e4",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        