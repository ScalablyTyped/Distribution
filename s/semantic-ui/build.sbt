organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180910Z-ea2b4b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181209Z-928df5",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180910Z-1aefef",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180910Z-7e4d2f",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180910Z-a09c08",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180910Z-b25ad0",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180910Z-fde386",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180910Z-0752a3",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181206Z-8b1d14",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180910Z-cd16bd",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180910Z-bd674a",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180910Z-8fca40",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180910Z-8a2680",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180910Z-a90af6",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180910Z-381465",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180910Z-25b65e",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180910Z-350e40",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180910Z-0577cd",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180910Z-5c57f9",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180910Z-6f1218",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180910Z-b6c749",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180910Z-e2ae20",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-081654",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        