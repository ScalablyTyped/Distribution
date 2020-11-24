organization := "org.scalablytyped"
name := "storybook__components"
version := "6.1.2-a4dc75"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-fa358f",
  "org.scalablytyped" %%% "emotion__core" % "10.1.1-cc8fad",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-ff7814",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-4fced5",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.31-f0b0d1",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-e63227",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20201002Z-cef456",
  "org.scalablytyped" %%% "overlayscrollbars" % "1.12-dt-20200515Z-a4a7dd",
  "org.scalablytyped" %%% "popperjs__core" % "2.5.4-dad28c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-0012d8",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200925Z-780360",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-cfb347",
  "org.scalablytyped" %%% "react-syntax-highlighter" % "13.5-dt-20201016Z-4278f8",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "storybook__api" % "6.1.2-130b11",
  "org.scalablytyped" %%% "storybook__channels" % "6.1.2-e2465c",
  "org.scalablytyped" %%% "storybook__router" % "6.1.2-e8a9a0",
  "org.scalablytyped" %%% "storybook__theming" % "6.1.2-a7cfbd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
