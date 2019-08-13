organization := "org.scalablytyped"
name := "storybook__theming"
version := "5.1.11-4da18a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.14-4f3217",
  "org.scalablytyped" %%% "emotion__core" % "10.0.14-ec5680",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.8-4d72f0",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.15-dafc6e",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.15-ae7207",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-3c2e35",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190809Z-2d489e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        