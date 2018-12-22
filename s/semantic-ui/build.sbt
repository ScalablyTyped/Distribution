organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180214Z-bec440"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-f533e1",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-d41a35",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-a2de43",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-67c82d",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-9dee9a",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-44f196",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-b3aa66",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-29bebb",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-ed5df0",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-98696e",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-aeea9e",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-b5a7e7",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-8c9d96",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-71b74c",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-7d5282",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-082797",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-2b3bda",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-6d793a",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-1c4527",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-7a903e",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-34e9d1",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-3a6abd",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        