organization := "org.scalablytyped"
name := "storybook__theming"
version := "5.0.11-a0452c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.10-63ffcf",
  "org.scalablytyped" %%% "emotion__core" % "10.0.10-4bd257",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-997f10",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.10-e9b366",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.10-d4a7b7",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-175c86",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-7e744c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190419Z-caf3c8",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        