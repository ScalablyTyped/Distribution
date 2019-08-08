organization := "org.scalablytyped"
name := "storybook__components"
version := "5.1.10-19427e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.14-93c441",
  "org.scalablytyped" %%% "emotion__core" % "10.0.14-459a25",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.8-4d72f0",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.14-684d21",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.14-5da20c",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-3c2e35",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-1a85e7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190807Z-04c1be",
  "org.scalablytyped" %%% "react-syntax-highlighter" % "10.2-dt-20190530Z-824b03",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "storybook__theming" % "5.1.10-c12c2f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        