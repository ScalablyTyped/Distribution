organization := "org.scalablytyped"
name := "storybook__components"
version := "5.2.5-ad4633"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.19-3c653c",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-581ff3",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-aecc7f",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-a785ac",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-3153ad",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-204041",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.0-91a4b3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191016Z-462cf8",
  "org.scalablytyped" %%% "react-textarea-autosize" % "4.3.0-dt-20190404Z-080395",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.5-ac19e8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        