organization := "org.scalablytyped"
name := "storybook-react-router"
version := "1.0-dt-20220726Z-66e909"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-96c572",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-5ca42e",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-82c4da",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-5a73bf",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-5dfb0f",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-5100e9",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-b582b5",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1eb2b4",
  "org.scalablytyped" %%% "events" % "3.0-dt-20211202Z-44a4d0",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cb1e35",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5f1c10",
  "org.scalablytyped" %%% "fork-ts-checker-webpack-plugin" % "7.2.13-c43872",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-6d1302",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-85c9dc",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "node-abort-controller" % "3.0.1-c1dc5c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-137229",
  "org.scalablytyped" %%% "re2" % "1.17.7-41dbc1",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "react-element-to-jsx-string" % "15.0.0-7f615c",
  "org.scalablytyped" %%% "react-router" % "6.4.2-3266a4",
  "org.scalablytyped" %%% "remix-run__router" % "1.0.2-55e80f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-427ce3",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-d3379f",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "storybook__addons" % "6.5.13-db891b",
  "org.scalablytyped" %%% "storybook__api" % "6.5.13-c61c8d",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.13-6762bb",
  "org.scalablytyped" %%% "storybook__core-common" % "6.5.13-dc82d3",
  "org.scalablytyped" %%% "storybook__docs-tools" % "6.5.13-18eb32",
  "org.scalablytyped" %%% "storybook__react" % "6.5.13-19b49f",
  "org.scalablytyped" %%% "storybook__router" % "6.5.13-1fd3f6",
  "org.scalablytyped" %%% "storybook__store" % "6.5.13-ee5940",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.13-abd429",
  "org.scalablytyped" %%% "synchronous-promise" % "2.0.16-bb25c6",
  "org.scalablytyped" %%% "tapable" % "2.2.1-ad807d",
  "org.scalablytyped" %%% "typescript" % "4.9.3-52822d",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-4bb631",
  "org.scalablytyped" %%% "webpack" % "5.75.0-18231e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
