organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180910Z-e36b7e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181206Z-03d301",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180910Z-26e2a5",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180910Z-42c896",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180910Z-b289c8",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180910Z-a7dcd8",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180910Z-e52823",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180910Z-38bcef",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181206Z-266865",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180910Z-84a7d1",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180910Z-3ac41a",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180910Z-919454",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180910Z-2f96d0",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180910Z-0e0e27",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180910Z-16080d",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180910Z-73c5ab",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180910Z-af1b41",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180910Z-219580",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180910Z-2c7896",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180910Z-fdfa98",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180910Z-3e7230",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180910Z-494833",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-3181aa",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        