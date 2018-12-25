organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180214Z-5e6ca8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-c4ac04",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-9131d3",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-c9a755",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-c185da",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-32b263",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-cdbea0",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-7357ae",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-bbbe90",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-a3309c",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-cd870d",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-902cae",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-c8a189",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-ed4357",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-c2b976",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-7219cf",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-0502d7",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-ee854a",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-85d621",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-ca68b2",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-91a19a",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-9a8e75",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-3a6abd",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        