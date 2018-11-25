organization := "com.scalablytyped"
name := "pulumi__pulumi"
version := "0.16.0-c62c6f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-acd933",
  "com.scalablytyped" %%% "buffer-from" % "1.1-dt-20180910Z-87e682",
  "com.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-9d1bfa",
  "com.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180910Z-9a749e",
  "com.scalablytyped" %%% "grpc" % "1.15.1-f61946",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-ace41c",
  "com.scalablytyped" %%% "make-error" % "1.3.5-c3f304",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-dd566d",
  "com.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-206058",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180910Z-7bccfc",
  "com.scalablytyped" %%% "protobufjs" % "6.8.8-6842ae",
  "com.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-2c7cd8",
  "com.scalablytyped" %%% "protobufjs__base64" % "1.1.2-2c8f62",
  "com.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-63e3a1",
  "com.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-03b0c2",
  "com.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-2abc1b",
  "com.scalablytyped" %%% "protobufjs__float" % "1.0.2-960bf5",
  "com.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-e8e70d",
  "com.scalablytyped" %%% "protobufjs__path" % "1.1.2-c48b13",
  "com.scalablytyped" %%% "protobufjs__pool" % "1.1.0-2fb531",
  "com.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-0af194",
  "com.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180910Z-b49445",
  "com.scalablytyped" %%% "require-from-string" % "1.2-dt-20180910Z-6d787b",
  "com.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-c99a16",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "ts-node" % "7.0.1-318e76",
  "com.scalablytyped" %%% "typescript" % "3.1.3-c44b5f",
  "com.scalablytyped" %%% "upath" % "1.1.0-0c9cff",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        