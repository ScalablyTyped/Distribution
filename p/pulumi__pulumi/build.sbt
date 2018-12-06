organization := "org.scalablytyped"
name := "pulumi__pulumi"
version := "0.16.7-8f2fef"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-904d61",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180910Z-08d7ed",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-0025b6",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180910Z-cac877",
  "org.scalablytyped" %%% "grpc" % "1.16.1-4d8b49",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-76729d",
  "org.scalablytyped" %%% "make-error" % "1.3.5-7273db",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-231fe7",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-0a7381",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180910Z-fb9b73",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e1d881",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-9b70f4",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-2605b5",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-8a3782",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-000df5",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-ddce07",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-be31e2",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-b25b54",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-b26c77",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-ddd0b7",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-c727dc",
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180910Z-a4776c",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180910Z-a9e68b",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-762bad",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-cccca8",
  "org.scalablytyped" %%% "typescript" % "3.2.1-a03537",
  "org.scalablytyped" %%% "upath" % "1.1.0-8271a9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        