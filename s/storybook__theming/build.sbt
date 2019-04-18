organization := "org.scalablytyped"
name := "storybook__theming"
version := "5.0.10-de089e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.10-aef65c",
  "org.scalablytyped" %%% "emotion__core" % "10.0.10-6a84ef",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-997f10",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.10-579551",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.10-61170a",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-175c86",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-7e744c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-26e47b",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        