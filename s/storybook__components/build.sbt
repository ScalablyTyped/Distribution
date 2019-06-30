organization := "org.scalablytyped"
name := "storybook__components"
version := "5.1.9-8c3130"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.14-998de4",
  "org.scalablytyped" %%% "emotion__core" % "10.0.10-f3ba01",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-cac7f5",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.12-14591e",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.13-6bdd09",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-e5569f",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-ad86ce",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190621Z-9e424f",
  "org.scalablytyped" %%% "react-syntax-highlighter" % "10.2-dt-20190530Z-bcc289",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "storybook__theming" % "5.1.9-cb087a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        