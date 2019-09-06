organization := "org.scalablytyped"
name := "storybook__api"
version := "5.1.11-ed1796"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.17-0f7605",
  "org.scalablytyped" %%% "emotion__core" % "10.0.14-59d9d1",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.8-7e7b05",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.15-53824d",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.15-37463a",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-b10e26",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-c13957",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-bd378a",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20190404Z-5af275",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-53b9fb",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "storybook__channels" % "4.1-dt-20190605Z-773b42",
  "org.scalablytyped" %%% "storybook__router" % "5.1.11-e4bb8f",
  "org.scalablytyped" %%% "storybook__theming" % "5.1.11-7b3847")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        