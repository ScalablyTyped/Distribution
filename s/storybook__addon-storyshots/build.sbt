organization := "org.scalablytyped"
name := "storybook__addon-storyshots"
version := "5.3.18-be025d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "9.1.9-1e0b57",
  "org.scalablytyped" %%% "angular__core" % "9.1.9-28bd96",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.27-623528",
  "org.scalablytyped" %%% "emotion__core" % "10.0.28-56488c",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.15-afc453",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.27-f86e9d",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.28-57bf2c",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.3-74adc5",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.4-292039",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200515Z-32d5c3",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20200518Z-48aa64",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-bb8752",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200519Z-0dc149",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-f9eae7",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "reach__router" % "1.3-dt-20200426Z-89c27a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-1eb77e",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-d1f890",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "storybook__addons" % "5.3.18-eb521c",
  "org.scalablytyped" %%% "storybook__api" % "5.3.18-94ee81",
  "org.scalablytyped" %%% "storybook__channels" % "5.3.18-a4f6b2",
  "org.scalablytyped" %%% "storybook__client-api" % "5.3.18-78b4c7",
  "org.scalablytyped" %%% "storybook__router" % "5.3.18-74050d",
  "org.scalablytyped" %%% "storybook__theming" % "5.3.18-c82b45",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200515Z-dc9245",
  "org.scalablytyped" %%% "typescript" % "3.9.3-b53cb0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
