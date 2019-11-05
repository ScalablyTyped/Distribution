organization := "org.scalablytyped"
name := "storybook__components"
version := "5.2.5-db4969"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.19-4b3fb9",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-8dd494",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-aecc7f",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-93a4bc",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-088cff",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-204041",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.0-91a4b3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-9e835e",
  "org.scalablytyped" %%% "react-textarea-autosize" % "4.3.0-dt-20191105Z-dc5e34",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.5-d155f6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        