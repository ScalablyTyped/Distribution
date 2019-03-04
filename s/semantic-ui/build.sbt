organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20190212Z-f5bc02"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-f5a31c",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-e30977",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-97e101",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-c24550",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-cd4806",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-bbb34b",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-fa70a4",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-aa3215",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-699609",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-c410cf",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-d4b845",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-a10642",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-a342cf",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-cbcf20",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-82ca05",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-8a15be",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-d3dc35",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-576da2",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-f34c1c",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-8c39a7",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-b196ee",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-b709fe",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        