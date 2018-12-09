organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180910Z-de1f8f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181209Z-f8f791",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180910Z-c420d7",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180910Z-81548c",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180910Z-3c0e12",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180910Z-4b8d76",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180910Z-e783b2",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180910Z-e3d6d0",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181206Z-1c296b",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180910Z-4ca9fc",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180910Z-34ea63",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180910Z-46c807",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180910Z-adcf16",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180910Z-3cb388",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180910Z-07a378",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180910Z-8b7e5f",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180910Z-0fd4c5",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180910Z-10d70b",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180910Z-df7f9c",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180910Z-33a567",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180910Z-14fac4",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180910Z-0aa099",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-27b737",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        