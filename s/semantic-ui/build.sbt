organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20190212Z-97d1e7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-8061ce",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-9a8a8d",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-cd4700",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-7c09b7",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-6416bb",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-b2f381",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-dc0fc0",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-3c9e3e",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-a8642d",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-e1672b",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-1efc86",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-034b1e",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-e41d6f",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-e3c25c",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-1f6d88",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-d441a3",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-c37521",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-146475",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-a07658",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-cbca4c",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-bac4a2",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a5e2be",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        