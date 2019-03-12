organization := "org.scalablytyped"
name := "pulumi__kubernetes"
version := "v0.21.0-638149"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-56c0cd",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-a6ccac",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-6c91bf",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-334b9b",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180214Z-7cbf62",
  "org.scalablytyped" %%% "grpc" % "1.19.0-7bbcfe",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-0397ba",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190214Z-e15c6b",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190214Z-4fd6b5",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-b30bce",
  "org.scalablytyped" %%% "make-error" % "1.3.5-438a4b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-b5ce4c",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-cb319b",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-e0cf78",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-d709de",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-80045a",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-6d28c3",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-46201f",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-63857b",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-fe2693",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-c2c6bd",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-3b892b",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-97bb93",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-8051ed",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-7152e5",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-1df087",
  "org.scalablytyped" %%% "pulumi__pulumi" % "0.17.1-bd10d0",
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180512Z-f03b75",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180214Z-6fbfdf",
  "org.scalablytyped" %%% "shell-quote" % "1.6-dt-20190115Z-8aa420",
  "org.scalablytyped" %%% "source-map-support" % "0.5-dt-20190224Z-9a4d10",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20190212Z-18a81e",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-59830d",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-09c87f",
  "org.scalablytyped" %%% "upath" % "1.1.2-339e4c",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-1e9b47")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        