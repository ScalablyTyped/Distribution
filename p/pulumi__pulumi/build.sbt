organization := "org.scalablytyped"
name := "pulumi__pulumi"
version := "0.16.9-cc7546"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-7e672d",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-9a9f6b",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-4cfaa6",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180214Z-56fc87",
  "org.scalablytyped" %%% "grpc" % "1.17.0-fd216c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-fb9bd5",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-f1ebdd",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-ca8e22",
  "org.scalablytyped" %%% "make-error" % "1.3.5-fcfd33",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-86ee84",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-00cb09",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-133aeb",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-623ff0",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-c9cd0e",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-4d395a",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-393c71",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-75a7a1",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-a7a2c3",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-87f989",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-449d21",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-747022",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-32e1b5",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-c56e65",
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180512Z-261f35",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180214Z-486d64",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-a3e4d1",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-56b257",
  "org.scalablytyped" %%% "typescript" % "3.2.2-12aee5",
  "org.scalablytyped" %%% "upath" % "1.1.0-28ceec")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        