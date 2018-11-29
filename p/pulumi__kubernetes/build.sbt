organization := "com.scalablytyped"
name := "pulumi__kubernetes"
version := "v0.17.5-a31908"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-e99df0",
  "com.scalablytyped" %%% "buffer-from" % "1.1-dt-20180910Z-ad6a3b",
  "com.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-0d6c56",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-8a7f1f",
  "com.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180910Z-a57e55",
  "com.scalablytyped" %%% "grpc" % "1.16.1-638629",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-2da08f",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-aa3127",
  "com.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-cac3f5",
  "com.scalablytyped" %%% "make-error" % "1.3.5-6eda38",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-5ec0b9",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-a475cc",
  "com.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-697e07",
  "com.scalablytyped" %%% "mocha" % "5.2-dt-20180910Z-173929",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180910Z-ebbee6",
  "com.scalablytyped" %%% "protobufjs" % "6.8.8-183195",
  "com.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-f1a9b6",
  "com.scalablytyped" %%% "protobufjs__base64" % "1.1.2-b9574f",
  "com.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-bc632a",
  "com.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-f0b1ba",
  "com.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-7e30cc",
  "com.scalablytyped" %%% "protobufjs__float" % "1.0.2-e23db2",
  "com.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-dd54d5",
  "com.scalablytyped" %%% "protobufjs__path" % "1.1.2-e3ab94",
  "com.scalablytyped" %%% "protobufjs__pool" % "1.1.0-26d6db",
  "com.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-778e95",
  "com.scalablytyped" %%% "pulumi__pulumi" % "0.16.6-471621",
  "com.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180910Z-2592b6",
  "com.scalablytyped" %%% "require-from-string" % "1.2-dt-20180910Z-7740be",
  "com.scalablytyped" %%% "shell-quote" % "1.6-dt-20180910Z-3d59d1",
  "com.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-56237b",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tmp" % "0.0-dt-20180910Z-7b9d49",
  "com.scalablytyped" %%% "ts-node" % "7.0.1-d7386b",
  "com.scalablytyped" %%% "typescript" % "3.2.1-5cd657",
  "com.scalablytyped" %%% "upath" % "1.1.0-b75c7a",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        