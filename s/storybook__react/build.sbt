organization := "org.scalablytyped"
name := "storybook__react"
version := "5.2.6-649bb5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.19-487fe0",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-bd7690",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-f6e8da",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-ef9a53",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-9629ff",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-602d68",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-4ceb2f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20191009Z-5dd243",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191123Z-d1d56f",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "storybook__addons" % "5.2.6-8cbf37",
  "org.scalablytyped" %%% "storybook__api" % "5.2.6-1a3a0b",
  "org.scalablytyped" %%% "storybook__channels" % "5.2.6-06fa66",
  "org.scalablytyped" %%% "storybook__router" % "5.2.6-a877f0",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.6-5dcc2d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        