organization := "org.scalablytyped"
name := "pulumi__pulumi"
version := "0.16.11-32e1e6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-035afc",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-f58c5e",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-cf9880",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180214Z-41bfc9",
  "org.scalablytyped" %%% "grpc" % "1.17.0-cb415b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-361529",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-3ea002",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-3de878",
  "org.scalablytyped" %%% "make-error" % "1.3.5-0e5d32",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-fcc4b6",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-ae5704",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-6377b0",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-959624",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-4cbd9a",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-e150cf",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-0743f6",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-777313",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-494ba5",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-e0366f",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-add352",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-339b33",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-6dadc2",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-1db5b2",
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180512Z-370fb8",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180214Z-6fd117",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-e778dd",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-c3b6c9",
  "org.scalablytyped" %%% "typescript" % "3.2.2-65de7b",
  "org.scalablytyped" %%% "upath" % "1.1.0-4ad812")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        