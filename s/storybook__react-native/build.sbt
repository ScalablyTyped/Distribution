organization := "org.scalablytyped"
name := "storybook__react-native"
version := "5.2.6-fc02b7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.19-a28b27",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-9a50c4",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-02509b",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-b142ff",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-6e7555",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-fb5db7",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-b69538",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-815dc4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191118Z-0a5f57",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20191009Z-a01247",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191122Z-caf4d8",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191121Z-89fb36",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "storybook__addons" % "5.2.6-a1ff47",
  "org.scalablytyped" %%% "storybook__api" % "5.2.6-df1d6f",
  "org.scalablytyped" %%% "storybook__channels" % "5.2.6-4cda16",
  "org.scalablytyped" %%% "storybook__client-api" % "5.2.6-383ff5",
  "org.scalablytyped" %%% "storybook__router" % "5.2.6-64e75f",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.6-e7cc47")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        