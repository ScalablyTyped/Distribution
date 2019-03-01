organization := "org.scalablytyped"
name := "pulumi__kubernetes"
version := "v0.20.3-a75911"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-fb83b6",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-5fe839",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-499eae",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-eb36a4",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180214Z-207926",
  "org.scalablytyped" %%% "grpc" % "1.18.0-c7c229",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-970eae",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20190212Z-230f3e",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20190212Z-4af46b",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-9f7187",
  "org.scalablytyped" %%% "make-error" % "1.3.5-b64156",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8c05a2",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-e2a650",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-6559dc",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-1e1851",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-0affdf",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-0a9f1a",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-11ba80",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-194d25",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-fcd7c0",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-5309c0",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-22d711",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-b6fcaa",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-dcfcdb",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-7a72e9",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-a1c1c6",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-a2b675",
  "org.scalablytyped" %%% "pulumi__pulumi" % "0.16.17-9b517f",
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180512Z-8b5eff",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180214Z-1100e7",
  "org.scalablytyped" %%% "shell-quote" % "1.6-dt-20190115Z-0016a0",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20190212Z-72814c",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20190212Z-b41bcf",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-c05d9d",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-5c20b0",
  "org.scalablytyped" %%% "upath" % "1.1.0-00fd53",
  "org.scalablytyped" %%% "yn" % "3.0-dt-20190117Z-30dc82")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        