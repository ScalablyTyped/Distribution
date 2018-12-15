organization := "org.scalablytyped"
name := "pulumi__kubernetes"
version := "v0.18.0-42e944"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-54c33b",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180910Z-307a1e",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-7201ce",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-274633",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180910Z-97e7fe",
  "org.scalablytyped" %%% "grpc" % "1.16.1-ab6594",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-816787",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-153ce0",
  "org.scalablytyped" %%% "make-error" % "1.3.5-163e44",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-c002a7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-ab6005",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-b93923",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20180910Z-3ebcb3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180910Z-d030b8",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-e136ca",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-d3e3b2",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-d9ae65",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-d4193a",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-907098",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-407e0b",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-bc95c4",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-cf41d5",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-632fdf",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-ccad89",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-51b4ae",
  "org.scalablytyped" %%% "pulumi__pulumi" % "0.16.8-d4a353",
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180910Z-0170c0",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180910Z-c838b3",
  "org.scalablytyped" %%% "shell-quote" % "1.6-dt-20180910Z-49639d",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-5d16f0",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20180910Z-74e7c2",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-53bd3f",
  "org.scalablytyped" %%% "typescript" % "3.2.2-542c62",
  "org.scalablytyped" %%% "upath" % "1.1.0-f060d3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        