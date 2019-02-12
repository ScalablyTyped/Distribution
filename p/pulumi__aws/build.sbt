organization := "org.scalablytyped"
name := "pulumi__aws"
version := "v0.16.8-77502c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-b54dd4",
  "org.scalablytyped" %%% "aws-sdk" % "2.401.0-5c6ec0",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-2d42fd",
  "org.scalablytyped" %%% "buffer" % "5.2.1-abfb85",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-7211d8",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-64d288",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-a792d3",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-c467a0",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180214Z-207190",
  "org.scalablytyped" %%% "grpc" % "1.18.0-c89e8c",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-501bf7",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-ab1fa3",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-153059",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-02eb4a",
  "org.scalablytyped" %%% "make-error" % "1.3.5-95be7b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-98fe12",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-850695",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-49639d",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-e26d13",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-6367f2",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-8a9473",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-ee2249",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-b87ef3",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-e0df27",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-f2eb3d",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-7cc4d0",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-22c235",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-9c4942",
  "org.scalablytyped" %%% "pulumi__pulumi" % "0.16.14-5dbca4",
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180512Z-540b54",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180214Z-e7503c",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-c31b4c",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-6c58e0",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-0bfa2a",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-2630d2",
  "org.scalablytyped" %%% "typescript" % "3.3.3-7959f4",
  "org.scalablytyped" %%% "upath" % "1.1.0-95d721",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-e325b4",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-cec982",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-ce47fc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        