organization := "org.scalablytyped"
name := "pulumi__cloud"
version := "v0.16.2-b3f74d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-68d6da",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-5d3527",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-2cb213",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180214Z-4a967d",
  "org.scalablytyped" %%% "grpc" % "1.17.0-20f5b7",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-8e6897",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-dd6e2e",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-a0b1b2",
  "org.scalablytyped" %%% "make-error" % "1.3.5-2ccfc8",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-077fe7",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-524f53",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-d891ae",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-8af596",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-eb4ed7",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-8265ef",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-a9eb67",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-b99416",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-c7db0b",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-29d2d9",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-db95a2",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-65a6ba",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-4b21fc",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-21d69c",
  "org.scalablytyped" %%% "pulumi__pulumi" % "0.16.9-149529",
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180512Z-e371a7",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180214Z-9c7518",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-a75495",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-634001",
  "org.scalablytyped" %%% "typescript" % "3.2.2-c77b02",
  "org.scalablytyped" %%% "upath" % "1.1.0-10ead0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        