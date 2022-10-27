organization := "org.scalablytyped"
name := "storybook__mdx1-csf"
version := "0.0.4-91990e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-fcbdcb",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-580652",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-602e3f",
  "org.scalablytyped" %%% "babel__parser" % "7.19.6-1f26d3",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-c402ef",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-1aedc0",
  "org.scalablytyped" %%% "babel__types" % "7.19.4-ea0dd0",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "events" % "3.0-dt-20211202Z-4cfc23",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-7a82fe",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-87e3cc",
  "org.scalablytyped" %%% "fork-ts-checker-webpack-plugin" % "7.2.13-e174f1",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "node-abort-controller" % "3.0.1-879d06",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "re2" % "1.17.7-18b669",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221025Z-ca420a",
  "org.scalablytyped" %%% "react-element-to-jsx-string" % "15.0.0-6e4098",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-9310ee",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5e7139",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "storybook__addons" % "6.5.13-d1b4c9",
  "org.scalablytyped" %%% "storybook__api" % "6.5.13-902322",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.13-52db1d",
  "org.scalablytyped" %%% "storybook__core-common" % "6.5.13-d5dd24",
  "org.scalablytyped" %%% "storybook__docs-tools" % "6.5.13-1feb8b",
  "org.scalablytyped" %%% "storybook__react" % "6.5.13-ca74c4",
  "org.scalablytyped" %%% "storybook__router" % "6.5.13-a9fc86",
  "org.scalablytyped" %%% "storybook__store" % "6.5.13-5efa74",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.13-275b12",
  "org.scalablytyped" %%% "synchronous-promise" % "2.0.16-8f4fff",
  "org.scalablytyped" %%% "tapable" % "2.2.1-52b605",
  "org.scalablytyped" %%% "typescript" % "4.8.4-60b1be",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "webpack" % "5.74.0-641d67")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
