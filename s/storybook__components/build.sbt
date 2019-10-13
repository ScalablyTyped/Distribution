organization := "org.scalablytyped"
name := "storybook__components"
version := "5.2.3-89b7b1"
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
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-99a62e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-965e98",
  "org.scalablytyped" %%% "react-textarea-autosize" % "4.3.0-dt-20190404Z-dce429",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.3-a6790d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        