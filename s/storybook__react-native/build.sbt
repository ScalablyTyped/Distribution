organization := "org.scalablytyped"
name := "storybook__react-native"
version := "5.2.3-da3e64"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.19-10b30a",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-ebfc69",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-aecc7f",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-22c429",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-543121",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-204041",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-dd73fa",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-2fbebe",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191009Z-45ddf4",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-c62b25",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20191009Z-5968ee",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-965e98",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191007Z-76b392",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "storybook__addons" % "5.2.3-00c2d0",
  "org.scalablytyped" %%% "storybook__api" % "5.2.3-f75086",
  "org.scalablytyped" %%% "storybook__channels" % "5.2.3-a45358",
  "org.scalablytyped" %%% "storybook__client-api" % "5.2.3-20bf01",
  "org.scalablytyped" %%% "storybook__router" % "5.2.3-176fc6",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.3-a6790d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        