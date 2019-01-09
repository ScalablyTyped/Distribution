organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180214Z-baa7ea"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-ec51da",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-98f126",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-fe8dca",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-937705",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-0e6cbd",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-3b4f32",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-dd98c2",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-be47c4",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-2e3d9b",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-e5ff12",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-619162",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-390257",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-4412ca",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-313871",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-f4d692",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-536f09",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-50e42f",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-01698e",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-598077",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-6db3e2",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-28edc0",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-9e9c07",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        