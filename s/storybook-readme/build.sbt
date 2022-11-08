organization := "org.scalablytyped"
name := "storybook-readme"
version := "5.0-dt-20220726Z-0ba9ad"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-6482f2",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-efd9cc",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-412870",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-021aec",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-744489",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b54012",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-5a1686",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "events" % "3.0-dt-20211202Z-4cfc23",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-944d8b",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-0c6b73",
  "org.scalablytyped" %%% "fork-ts-checker-webpack-plugin" % "7.2.13-9117e2",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "node-abort-controller" % "3.0.1-879d06",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "re2" % "1.17.7-a226e5",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-e64588",
  "org.scalablytyped" %%% "react-element-to-jsx-string" % "15.0.0-445517",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-3da904",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-3b575f",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "storybook__addons" % "6.5.13-3c764e",
  "org.scalablytyped" %%% "storybook__api" % "6.5.13-ae4414",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.13-52db1d",
  "org.scalablytyped" %%% "storybook__core-common" % "6.5.13-10a3c2",
  "org.scalablytyped" %%% "storybook__docs-tools" % "6.5.13-72da16",
  "org.scalablytyped" %%% "storybook__react" % "6.5.13-ace74e",
  "org.scalablytyped" %%% "storybook__router" % "6.5.13-7399d5",
  "org.scalablytyped" %%% "storybook__store" % "6.5.13-c14660",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.13-497661",
  "org.scalablytyped" %%% "synchronous-promise" % "2.0.16-8f4fff",
  "org.scalablytyped" %%% "tapable" % "2.2.1-52b605",
  "org.scalablytyped" %%% "typescript" % "4.8.4-60b1be",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "webpack" % "5.74.0-3f97e9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
