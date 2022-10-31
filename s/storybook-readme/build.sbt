organization := "org.scalablytyped"
name := "storybook-readme"
version := "5.0-dt-20220726Z-8d2952"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-8684db",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-043aa4",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-bf895e",
  "org.scalablytyped" %%% "babel__parser" % "7.20.0-6157ab",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-1a1261",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-aa17f1",
  "org.scalablytyped" %%% "babel__types" % "7.20.0-d18d74",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "events" % "3.0-dt-20211202Z-4cfc23",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-faf4dd",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-ed8fc0",
  "org.scalablytyped" %%% "fork-ts-checker-webpack-plugin" % "7.2.13-1f49b8",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "node-abort-controller" % "3.0.1-879d06",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "re2" % "1.17.7-7aac79",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221027Z-1a0a13",
  "org.scalablytyped" %%% "react-element-to-jsx-string" % "15.0.0-4bb64e",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-d57fbb",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-f95ba3",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "storybook__addons" % "6.5.13-fb936c",
  "org.scalablytyped" %%% "storybook__api" % "6.5.13-d07efb",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.13-52db1d",
  "org.scalablytyped" %%% "storybook__core-common" % "6.5.13-022c08",
  "org.scalablytyped" %%% "storybook__docs-tools" % "6.5.13-a3b1e1",
  "org.scalablytyped" %%% "storybook__react" % "6.5.13-06994b",
  "org.scalablytyped" %%% "storybook__router" % "6.5.13-594799",
  "org.scalablytyped" %%% "storybook__store" % "6.5.13-f73668",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.13-d79c40",
  "org.scalablytyped" %%% "synchronous-promise" % "2.0.16-8f4fff",
  "org.scalablytyped" %%% "tapable" % "2.2.1-52b605",
  "org.scalablytyped" %%% "typescript" % "4.8.4-60b1be",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "webpack" % "5.74.0-53ab06")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
