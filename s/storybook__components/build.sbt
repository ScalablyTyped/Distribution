organization := "org.scalablytyped"
name := "storybook__components"
version := "5.2.0-ce0ab6"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.18-e98529",
  "org.scalablytyped" %%% "emotion__core" % "10.0.14-59d9d1",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.8-7e7b05",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-c13f49",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.17-a5e11f",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-b10e26",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-5e90d9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-bd378a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-53b9fb",
  "org.scalablytyped" %%% "react-syntax-highlighter" % "11.0-dt-20190910Z-6c9f4b",
  "org.scalablytyped" %%% "react-textarea-autosize" % "4.3.0-dt-20190404Z-5d840f",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.0-a2e8cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        