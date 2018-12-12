organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180910Z-eee4b6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181212Z-994342",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180910Z-545e1b",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180910Z-152e03",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180910Z-8035d3",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180910Z-2e2df7",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180910Z-a1e9e0",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180910Z-f6a944",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181206Z-d9e747",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180910Z-97b0e2",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180910Z-67bb29",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180910Z-cabcbf",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180910Z-7e1d5e",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180910Z-b86db7",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180910Z-f723c0",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180910Z-dc06d0",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180910Z-de8a1c",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180910Z-965c7d",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180910Z-ad7be3",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180910Z-38cd5a",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180910Z-889885",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180910Z-6f2ca8",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-27b737",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        