organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180910Z-cf9391"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181214Z-7b71e9",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180910Z-89d24f",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180910Z-b6af70",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180910Z-96f45d",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180910Z-1f3a22",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180910Z-98f561",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180910Z-a0d005",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181206Z-8bd617",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180910Z-73cfe3",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180910Z-d14691",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180910Z-f34142",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180910Z-498e31",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180910Z-28ae2e",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180910Z-1b3d9b",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180910Z-3cd8d7",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180910Z-64de23",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180910Z-128096",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180910Z-a29bfe",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180910Z-6037ff",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180910Z-09a421",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180910Z-ce45e7",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-e65330",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        