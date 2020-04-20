organization := "org.scalablytyped"
name := "storybook__components"
version := "5.3.18-ca3db4"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-313239",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-83a83e",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-6d5418",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.15-833015",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-2b433a",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.28-b51a02",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-927e6c",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-1c811d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-11830c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200409Z-0bc722",
  "org.scalablytyped" %%% "react-syntax-highlighter" % "11.0-dt-20200225Z-864ff2",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.18-00aeea")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
