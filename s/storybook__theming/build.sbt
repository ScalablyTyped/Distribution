organization := "org.scalablytyped"
name := "storybook__theming"
version := "5.1.3-3e1f1d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-3bfbc5",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.10-13687d",
  "org.scalablytyped" %%% "emotion__core" % "10.0.10-8f84f5",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-23c28e",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.11-fc72bd",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.10-a25728",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-1fe70d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-4b3bf2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-62c565",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        