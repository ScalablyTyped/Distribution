organization := "org.scalablytyped"
name := "storybook__core-server"
version := "6.5.13-ed09fe"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-3b5adf",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-61b7b8",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-42cbbf",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-c798fc",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-3669d2",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b1d659",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-8b54ca",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9e7169",
  "org.scalablytyped" %%% "events" % "3.0-dt-20211202Z-210594",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-2966c9",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5cc384",
  "org.scalablytyped" %%% "fork-ts-checker-webpack-plugin" % "7.2.13-3606df",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-fdd79d",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-4d0efa",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "node-abort-controller" % "3.0.1-c1dc5c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-fa36ba",
  "org.scalablytyped" %%% "re2" % "1.17.7-7b689a",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-dd595f",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-088887",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "storybook__addons" % "6.5.13-1b00d0",
  "org.scalablytyped" %%% "storybook__api" % "6.5.13-285ea3",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.13-d6ee9f",
  "org.scalablytyped" %%% "storybook__core-common" % "6.5.13-760fc0",
  "org.scalablytyped" %%% "storybook__router" % "6.5.13-0db450",
  "org.scalablytyped" %%% "storybook__store" % "6.5.13-38f278",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.13-d1c993",
  "org.scalablytyped" %%% "synchronous-promise" % "2.0.16-2058ec",
  "org.scalablytyped" %%% "tapable" % "2.2.1-ad9de2",
  "org.scalablytyped" %%% "typescript" % "4.9.3-1dab2c",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-9ebd39",
  "org.scalablytyped" %%% "webpack" % "5.75.0-1b9e73",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-0611bd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
