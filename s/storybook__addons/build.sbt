organization := "org.scalablytyped"
name := "storybook__addons"
version := "5.3.19-baddf4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b0fb5c",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-9920ad",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-cc9a66",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-a423d1",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-426b22",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.31-8eeb59",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-228a3a",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200518Z-3f7280",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-16cddc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-f69275",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200426Z-1b2f59",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-695c73",
  "org.scalablytyped" %%% "std" % "3.9-7c0472",
  "org.scalablytyped" %%% "storybook__api" % "5.3.19-c8a9fd",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.19-28206a",
  "org.scalablytyped" %%% "storybook__router" % "5.3.19-ee948e",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.19-237018")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
