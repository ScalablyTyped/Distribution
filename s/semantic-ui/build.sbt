organization := "com.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180910Z-c37be8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "jquery" % "3.3-dt-20181206Z-02d7ed",
  "com.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180910Z-6c13dc",
  "com.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180910Z-331da4",
  "com.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180910Z-19ec3c",
  "com.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180910Z-1625b6",
  "com.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180910Z-82b0fa",
  "com.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180910Z-af711b",
  "com.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181206Z-b0ccda",
  "com.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180910Z-7313a3",
  "com.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180910Z-6ff888",
  "com.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180910Z-80a859",
  "com.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180910Z-c0ef31",
  "com.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180910Z-3cfc5a",
  "com.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180910Z-02c4fb",
  "com.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180910Z-b5c66c",
  "com.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180910Z-5a4a40",
  "com.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180910Z-dd992e",
  "com.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180910Z-a82b3c",
  "com.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180910Z-199883",
  "com.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180910Z-7416fc",
  "com.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180910Z-442433",
  "com.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-9c5dc2",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        