organization := "org.scalablytyped"
name := "pulumi__pulumi"
version := "0.16.19-8c679b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-5b0dde",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-75f405",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-4b83ac",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180214Z-d3b96c",
  "org.scalablytyped" %%% "grpc" % "1.19.0-115278",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190214Z-e859ac",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190214Z-921e8a",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-d4ffb6",
  "org.scalablytyped" %%% "make-error" % "1.3.5-f3ac28",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-5de375",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-3cef84",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-c130fb",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-c3e68e",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-a03f5d",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-86ab76",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-86ed03",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-04aaa9",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-a2cc95",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-4b38c0",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-f020d2",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-ae7ee1",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-f0cb50",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-225760",
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180512Z-327b42",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180214Z-1980f6",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-adb224",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-90ac46",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-4b18ce",
  "org.scalablytyped" %%% "upath" % "1.1.0-76b830",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-6050bd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        