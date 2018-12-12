organization := "org.scalablytyped"
name := "pulumi__cloud"
version := "v0.16.2-d266d3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180910Z-8cd3e7",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180910Z-04210e",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-eeb72f",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180910Z-1dd67e",
  "org.scalablytyped" %%% "grpc" % "1.16.1-eae5ff",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180910Z-3aa15f",
  "org.scalablytyped" %%% "make-error" % "1.3.5-70f813",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-aae1f0",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-9d5a07",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180910Z-81565f",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-f98d31",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-cf39e8",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-d7cd87",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-a2281d",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-eacc8a",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-9682d2",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-1d2334",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-fec06d",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-e6bd96",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-c28576",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-21ec1b",
  "org.scalablytyped" %%% "pulumi__pulumi" % "0.16.7-213b9f",
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180910Z-105a9d",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180910Z-c160bd",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180910Z-3d192b",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-f0e0f9",
  "org.scalablytyped" %%% "typescript" % "3.2.2-445e51",
  "org.scalablytyped" %%% "upath" % "1.1.0-25a817")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        