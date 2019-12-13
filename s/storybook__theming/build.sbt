organization := "org.scalablytyped"
name := "storybook__theming"
version := "5.2.8-7b690b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.19-45e5b0",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-ac707c",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-f6e8da",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-0a18d8",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-d9e0a9",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-602d68",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191209Z-f85fa6",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        