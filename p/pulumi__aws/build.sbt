organization := "org.scalablytyped"
name := "pulumi__aws"
version := "0.18.1-3fec6f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-d4bc38",
  "org.scalablytyped" %%% "aws-sdk" % "2.437.0-01f90d",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-7bbcaf",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-483c07",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190322Z-05edd1",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-3a85ce",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180214Z-8fb67a",
  "org.scalablytyped" %%% "grpc" % "1.19.0-993874",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-00ea77",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190214Z-01e943",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190214Z-4f4f78",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20190322Z-418504",
  "org.scalablytyped" %%% "make-error" % "1.3.5-57f61f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-8cca44",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-4e7e63",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-41a127",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-b2c136",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-7d3a63",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-e9c001",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-7658b2",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-d98038",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-04dd70",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-115d28",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-1fe064",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-aa4a7f",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-87cd30",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-3bda91",
  "org.scalablytyped" %%% "pulumi__pulumi" % "0.17.5-f76fc0",
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180512Z-6e0a65",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180214Z-85b005",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20190322Z-0f1d5f",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20190322Z-12bb56",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-2914ab",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-836dbb",
  "org.scalablytyped" %%% "typescript" % "3.4.2-a42773",
  "org.scalablytyped" %%% "upath" % "1.1.2-adf450",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-4ae640",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20190402Z-5711d7",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-8238a5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        