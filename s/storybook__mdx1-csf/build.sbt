organization := "org.scalablytyped"
name := "storybook__mdx1-csf"
version := "0.0.4-325ec0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-f4a508",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-317949",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-27b6b7",
  "org.scalablytyped" %%% "babel__parser" % "7.19.6-e8951f",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-f33532",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-0e2ba7",
  "org.scalablytyped" %%% "babel__types" % "7.19.4-1978dd",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9389e9",
  "org.scalablytyped" %%% "events" % "3.0-dt-20211202Z-2d4ac7",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-eec5d4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-693358",
  "org.scalablytyped" %%% "fork-ts-checker-webpack-plugin" % "7.2.13-fd867c",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-58e21d",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "node-abort-controller" % "3.0.1-8874ea",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "re2" % "1.17.7-9752ba",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "react-element-to-jsx-string" % "15.0.0-df1d01",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-547e57",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-91f487",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "storybook__addons" % "6.5.12-53abde",
  "org.scalablytyped" %%% "storybook__api" % "6.5.12-0820b1",
  "org.scalablytyped" %%% "storybook__channels" % "6.5.12-711db2",
  "org.scalablytyped" %%% "storybook__core-common" % "6.5.12-c9b0be",
  "org.scalablytyped" %%% "storybook__docs-tools" % "6.5.12-997f64",
  "org.scalablytyped" %%% "storybook__react" % "6.5.12-abdc11",
  "org.scalablytyped" %%% "storybook__router" % "6.5.12-07db7c",
  "org.scalablytyped" %%% "storybook__store" % "6.5.12-dc3b77",
  "org.scalablytyped" %%% "storybook__theming" % "6.5.12-de6667",
  "org.scalablytyped" %%% "synchronous-promise" % "2.0.16-44f8b1",
  "org.scalablytyped" %%% "tapable" % "2.2.1-7eb940",
  "org.scalablytyped" %%% "typescript" % "4.8.4-676e37",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-d613cd",
  "org.scalablytyped" %%% "webpack" % "5.74.0-bd3f64")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
