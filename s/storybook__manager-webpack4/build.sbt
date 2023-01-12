organization := "org.scalablytyped"
name := "storybook__manager-webpack4"
version := "6.5.13-b3779a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-e03df2",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-5b3929",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-5fc152",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-0ceec3",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-10b9d5",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b27c06",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-0db274",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6dfb17",
  "org.scalablytyped" %%% "events" % "3.0-dt-20211202Z-c3a2f0",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-118d16",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-e830b8",
  "org.scalablytyped" %%% "fork-ts-checker-webpack-plugin" % "7.2.13-c5e28b",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-64302b",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-381f52",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "node-abort-controller" % "3.0.1-d2c792",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-625bd0",
  "org.scalablytyped" %%% "re2" % "1.17.7-31fc73",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-21a261",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5be9af",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "storybook__core-common" % "6.5.13-3db5a8",
  "org.scalablytyped" %%% "tapable" % "2.2.1-7a5e1e",
  "org.scalablytyped" %%% "typescript" % "4.9.3-94f598",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-8d8221",
  "org.scalablytyped" %%% "webpack" % "5.75.0-5aadf4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
