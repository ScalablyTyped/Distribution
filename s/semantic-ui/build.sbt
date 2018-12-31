organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180214Z-8b25f5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-1d3df4",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-7674e9",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-26b129",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-907535",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-16d70d",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-1bab55",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-40dda8",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-bb06c7",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-64fc2c",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-e178fb",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-daed20",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-e57436",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-c2323c",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-cfddbb",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-1059bc",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-2385f1",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-9025e0",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-e61563",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-99ca8a",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-3c6cfc",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-b2c36f",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-f7ab30",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        