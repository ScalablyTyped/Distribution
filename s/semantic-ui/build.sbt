organization := "com.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180910Z-ac6b5c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "jquery" % "3.3-dt-20181027Z-c6ff09",
  "com.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180910Z-96cdf6",
  "com.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180910Z-ee1d82",
  "com.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180910Z-ef49d2",
  "com.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180910Z-9fa551",
  "com.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180910Z-a3df89",
  "com.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180910Z-6e5818",
  "com.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20180910Z-366a64",
  "com.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180910Z-87fd5a",
  "com.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180910Z-20a046",
  "com.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180910Z-560015",
  "com.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180910Z-9ce806",
  "com.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180910Z-4845d5",
  "com.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180910Z-27971d",
  "com.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180910Z-86f6f9",
  "com.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180910Z-6795bd",
  "com.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180910Z-4286ed",
  "com.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180910Z-0bbd5b",
  "com.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180910Z-fb64c2",
  "com.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180910Z-4dc667",
  "com.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180910Z-d866d9",
  "com.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-99baa3",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        