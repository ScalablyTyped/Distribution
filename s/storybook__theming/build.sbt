organization := "org.scalablytyped"
name := "storybook__theming"
version := "5.1.9-3c176f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.14-c2b389",
  "org.scalablytyped" %%% "emotion__core" % "10.0.10-e9a169",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-cac7f5",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.12-8c2b2a",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.13-ffbe58",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-e5569f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190621Z-8d8143",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        