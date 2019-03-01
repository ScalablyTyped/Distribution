organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20190212Z-045084"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-af4dd0",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-b58dd1",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-6d8f23",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-35f519",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-3acc83",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-b5e91b",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-7209f7",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-b1debc",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-f002da",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-f7dfd9",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-e2c882",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-0e7908",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-e4bdfe",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-013bae",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-0ff4a9",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-f9214a",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-254e1d",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-8e9d94",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-2cf29f",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-92ace5",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-60f555",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-e769d0",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        