organization := "org.scalablytyped"
name := "pulumi__aws"
version := "v0.16.5-1fa031"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-041603",
  "org.scalablytyped" %%% "aws-sdk" % "2.384.0-3eecf0",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-2ce84c",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-2a2ba1",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-47e6cf",
  "org.scalablytyped" %%% "events" % "1.2-dt-20180226Z-794124",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180214Z-3962fe",
  "org.scalablytyped" %%% "grpc" % "1.17.0-13cb44",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-bbea6c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-c58c27",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-9ca62e",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-c30cf6",
  "org.scalablytyped" %%% "make-error" % "1.3.5-40680a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b5dce1",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-54b1d3",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-6a0247",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-a1e1c0",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-770897",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-c931e6",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-5e843a",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-30774a",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-592e97",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-e194a5",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-9d3553",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-1d4f93",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-35f35b",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-eddee7",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-946a5f",
  "org.scalablytyped" %%% "pulumi__pulumi" % "0.16.9-f2531f",
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180512Z-a518a1",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180214Z-f71f91",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-5fd60a",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-dc40c5",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-5b8a80",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-13ab1d",
  "org.scalablytyped" %%% "typescript" % "3.2.2-aeda64",
  "org.scalablytyped" %%% "upath" % "1.1.0-7258bd",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-34dde2",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-710734")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        