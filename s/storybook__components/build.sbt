organization := "org.scalablytyped"
name := "storybook__components"
version := "5.1.11-2a4013"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.14-ff030e",
  "org.scalablytyped" %%% "emotion__core" % "10.0.14-78a0b3",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.8-59ff9a",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.15-1d3929",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.15-8d14f0",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-31530a",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-a949a4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "react-syntax-highlighter" % "10.2-dt-20190530Z-1ec676",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "storybook__theming" % "5.1.11-ff6fe5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        