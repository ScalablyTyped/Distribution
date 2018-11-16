organization := "com.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20181102Z-47c62d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "jquery" % "3.3-dt-20181102Z-ef9974",
  "com.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20181102Z-b21357",
  "com.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20181102Z-8b8872",
  "com.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20181102Z-fe3f06",
  "com.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20181102Z-aadb2d",
  "com.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20181102Z-6610c4",
  "com.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20181102Z-53fc1c",
  "com.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181102Z-85ef54",
  "com.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20181102Z-e072ad",
  "com.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20181102Z-643d1a",
  "com.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20181102Z-236193",
  "com.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20181102Z-bdd469",
  "com.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20181102Z-7d0dd1",
  "com.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20181102Z-91bcaa",
  "com.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20181102Z-54fe92",
  "com.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20181102Z-61d348",
  "com.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20181102Z-2bdb44",
  "com.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20181102Z-55a748",
  "com.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20181102Z-f591ed",
  "com.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20181102Z-0b847e",
  "com.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20181102Z-9ff2db",
  "com.scalablytyped" %%% "sizzle" % "2.3-dt-20181102Z-6214b8",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        