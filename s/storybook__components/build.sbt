organization := "org.scalablytyped"
name := "storybook__components"
version := "5.2.1-31414e"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.19-0a3e1c",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-92a3a0",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-f7b4ee",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-74de39",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-7e2b6b",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-b10e26",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-5e90d9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-06c3ac",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-b3917f",
  "org.scalablytyped" %%% "react-textarea-autosize" % "4.3.0-dt-20190404Z-f98304",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.1-1e81f2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        