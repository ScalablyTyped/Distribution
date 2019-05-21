organization := "org.scalablytyped"
name := "storybook__theming"
version := "5.0.11-912b6a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.10-40ec5b",
  "org.scalablytyped" %%% "emotion__core" % "10.0.10-bc9bae",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-f77f96",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.10-b7c444",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.10-d77670",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-0e800f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190508Z-56dde3",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        