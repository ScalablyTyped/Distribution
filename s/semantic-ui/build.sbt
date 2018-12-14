organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180910Z-0c78b3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181214Z-702232",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180910Z-d7485e",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180910Z-0becb2",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180910Z-7c1e42",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180910Z-544425",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180910Z-929617",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180910Z-48a33a",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181206Z-625242",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180910Z-66391a",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180910Z-e355cf",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180910Z-12ed6b",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180910Z-df66fb",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180910Z-5034bc",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180910Z-5b3a57",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180910Z-9ccc2b",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180910Z-53b82c",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180910Z-a810f1",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180910Z-61fe41",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180910Z-5f8f81",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180910Z-f1c252",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180910Z-abebb8",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-27b737",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        