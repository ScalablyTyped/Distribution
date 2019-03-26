organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20190212Z-e36b2d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-8c3191",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-c59b28",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-8cdd50",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-f7adda",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-1387e0",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-17fec1",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-72677a",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-5e32f6",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-fa9e42",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-1faf47",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-c22341",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-13c6ca",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-9f2acf",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-c632f0",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-b77178",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-8ca494",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-285c0d",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-8c3f4f",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-8426a8",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-2605a3",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-773732",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-bc4aa6",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        