organization := "org.scalablytyped"
name := "pulumi__cloud"
version := "v0.16.2-99abed"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-4c03df",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180910Z-f9199f",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-7260ba",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180910Z-c6aaf9",
  "org.scalablytyped" %%% "grpc" % "1.16.1-7af532",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-387ddd",
  "org.scalablytyped" %%% "make-error" % "1.3.5-15f803",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-18660e",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-a2e6b0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180910Z-a0d707",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-89b4f7",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-27957d",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-8b222a",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-bd1923",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-ce83b4",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-c51d9d",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-22a8a7",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-53afa0",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-b14493",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-6efed3",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-045d53",
  "org.scalablytyped" %%% "pulumi__pulumi" % "0.16.7-74b574",
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180910Z-d51182",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180910Z-7a6462",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-d1333e",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-8a9e06",
  "org.scalablytyped" %%% "typescript" % "3.2.2-fe9cc4",
  "org.scalablytyped" %%% "upath" % "1.1.0-6f28da")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        