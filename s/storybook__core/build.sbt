organization := "org.scalablytyped"
name := "storybook__core"
version := "6.1.2-6457ec"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "emotion__core" % "10.1.1-2311cd",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.16-65a8a4",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-f96a4e",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.31-dde0c8",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-2c7f18",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20201002Z-df0d91",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-f71cda",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200925Z-382d1c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "storybook__addons" % "6.1.2-2eae3a",
  "org.scalablytyped" %%% "storybook__api" % "6.1.2-1888a2",
  "org.scalablytyped" %%% "storybook__channels" % "6.1.2-52513c",
  "org.scalablytyped" %%% "storybook__client-api" % "6.1.2-59a730",
  "org.scalablytyped" %%% "storybook__router" % "6.1.2-86a300",
  "org.scalablytyped" %%% "storybook__theming" % "6.1.2-415149")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
