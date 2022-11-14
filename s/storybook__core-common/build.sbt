organization := "org.scalablytyped"
name := "storybook__core-common"
version := "6.5.13-d8ce76"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-8ddd54",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-0a8cda",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-aeb792",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-97fb28",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-0c7c84",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-7d45e9",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-2e222a",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1ed7c2",
  "org.scalablytyped" %%% "events" % "3.0-dt-20211202Z-c87c96",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-a7050d",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-2c076a",
  "org.scalablytyped" %%% "fork-ts-checker-webpack-plugin" % "7.2.13-89233a",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-aa50bf",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-e2d669",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "node-abort-controller" % "3.0.1-879d06",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-c05674",
  "org.scalablytyped" %%% "re2" % "1.17.7-349e63",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-91ce3a",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-9d2495",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "tapable" % "2.2.1-8e2762",
  "org.scalablytyped" %%% "typescript" % "4.8.4-227bad",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-af3fab",
  "org.scalablytyped" %%% "webpack" % "5.75.0-87f58a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
