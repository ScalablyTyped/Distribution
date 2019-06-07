organization := "org.scalablytyped"
name := "storybook__components"
version := "5.1.3-078102"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-8a2cd0",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.10-d1b5c7",
  "org.scalablytyped" %%% "emotion__core" % "10.0.10-7bc9c3",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-ea5d19",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.11-d01489",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.10-e1aaea",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-f65398",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-74d251",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c843c9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1fde1d",
  "org.scalablytyped" %%% "react-syntax-highlighter" % "10.2-dt-20190530Z-a252a1",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "storybook__theming" % "5.1.3-f88906")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        