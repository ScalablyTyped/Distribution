organization := "org.scalablytyped"
name := "storybook__react-native"
version := "5.2.5-11296a"
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
  "org.scalablytyped" %%% "eventemitter3" % "4.0.0-22646c",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-2fbebe",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191009Z-45ddf4",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20191009Z-6c6f24",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-9e835e",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191028Z-de58ef",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "storybook__addons" % "5.2.5-a18c77",
  "org.scalablytyped" %%% "storybook__api" % "5.2.5-a78663",
  "org.scalablytyped" %%% "storybook__channels" % "5.2.5-6a808a",
  "org.scalablytyped" %%% "storybook__client-api" % "5.2.5-b66acb",
  "org.scalablytyped" %%% "storybook__router" % "5.2.5-2279cd",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.5-d155f6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        