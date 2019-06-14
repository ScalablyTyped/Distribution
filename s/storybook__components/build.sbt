organization := "org.scalablytyped"
name := "storybook__components"
version := "5.1.7-e41658"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-3bfbc5",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.10-e11726",
  "org.scalablytyped" %%% "emotion__core" % "10.0.10-25a8a1",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-23c28e",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.12-f597d2",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.13-8b258c",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-1fe70d",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-d0f05a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-4b3bf2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-62c565",
  "org.scalablytyped" %%% "react-syntax-highlighter" % "10.2-dt-20190530Z-8d8281",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "storybook__theming" % "5.1.7-b98947")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        