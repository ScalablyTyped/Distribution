organization := "org.scalablytyped"
name := "storybook__theming"
version := "5.1.11-7b36c2"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f01b27",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.14-7324ba",
  "org.scalablytyped" %%% "emotion__core" % "10.0.14-bb98aa",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.8-6ec5b2",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.15-557645",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.15-76e5c9",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-7b1113",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-93079a",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        