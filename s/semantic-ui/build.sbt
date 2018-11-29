organization := "com.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180910Z-bfa7c4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "jquery" % "3.3-dt-20181027Z-d287eb",
  "com.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180910Z-974496",
  "com.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180910Z-095e34",
  "com.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180910Z-32a95c",
  "com.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180910Z-0e1a23",
  "com.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180910Z-6179e1",
  "com.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180910Z-ab3ae7",
  "com.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20180910Z-470777",
  "com.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180910Z-8bc192",
  "com.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180910Z-fd9de9",
  "com.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180910Z-3a90e7",
  "com.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180910Z-8597fd",
  "com.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180910Z-5ae3dd",
  "com.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180910Z-f4b5ee",
  "com.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180910Z-89608b",
  "com.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180910Z-33bd5a",
  "com.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180910Z-44f465",
  "com.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180910Z-f99232",
  "com.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180910Z-28dbd4",
  "com.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180910Z-7fd444",
  "com.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180910Z-3cd8e7",
  "com.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-9c5dc2",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        