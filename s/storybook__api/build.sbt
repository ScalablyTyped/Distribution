organization := "org.scalablytyped"
name := "storybook__api"
version := "5.1.11-56f299"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.14-33966f",
  "org.scalablytyped" %%% "emotion__core" % "10.0.14-6f3c99",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.8-7e7b05",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.15-4c0d76",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.15-a1180a",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-b10e26",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-c13957",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-fd4af0",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20190404Z-203600",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-6dcbc8",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "storybook__channels" % "4.1-dt-20190605Z-773b42",
  "org.scalablytyped" %%% "storybook__router" % "5.1.11-9e5d4c",
  "org.scalablytyped" %%% "storybook__theming" % "5.1.11-ab70e7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        