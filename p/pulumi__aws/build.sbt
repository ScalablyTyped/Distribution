organization := "org.scalablytyped"
name := "pulumi__aws"
version := "v0.16.6-dee2c8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-a40bdc",
  "org.scalablytyped" %%% "aws-sdk" % "2.390.0-e9fecb",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-c5a3f6",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-5bd474",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-3266eb",
  "org.scalablytyped" %%% "events" % "1.2-dt-20180226Z-b3b26c",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180214Z-de95e4",
  "org.scalablytyped" %%% "grpc" % "1.17.0-98d9cc",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-b22fa9",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-e12b56",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-595256",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-99178b",
  "org.scalablytyped" %%% "make-error" % "1.3.5-f18f71",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-fff6c3",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-3dd289",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-8d7875",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-ed1824",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-14f98a",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-3c3a8c",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-3e5519",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-c6fcbc",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-b178af",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-9e97a1",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-922b9f",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-87da94",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-9eee98",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-2cdf20",
  "org.scalablytyped" %%% "pulumi__pulumi" % "0.16.11-69f2cf",
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180512Z-09bf58",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180214Z-d23486",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-4089ba",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-2af35f",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-113222",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-36b1b0",
  "org.scalablytyped" %%% "typescript" % "3.2.4-3dde35",
  "org.scalablytyped" %%% "upath" % "1.1.0-0860dc",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-f35d60",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-8e79db",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-8e0386")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        