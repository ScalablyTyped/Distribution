organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180214Z-eb3cee"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-1d30f0",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-3c7805",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-50b939",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-799664",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-14ac1e",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-870ec0",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-fb547d",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-42d675",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-d4c9ec",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-2653ab",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-6ed485",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-251009",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-859abc",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-e9d20f",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-7e4e16",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-f6315b",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-033aec",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-33d967",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-020697",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-ff64fe",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-ff5e73",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-e7e832",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        