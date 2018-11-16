organization := "com.scalablytyped"
name := "pulumi__pulumi"
version := "0.16.2-8d11cb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "arrify" % "1.0-dt-20181102Z-13de40",
  "com.scalablytyped" %%% "buffer-from" % "1.1-dt-20181102Z-48a000",
  "com.scalablytyped" %%% "diff" % "3.5-dt-20181105Z-5885f0",
  "com.scalablytyped" %%% "google-protobuf" % "3.2-dt-20181102Z-806dd4",
  "com.scalablytyped" %%% "grpc" % "1.16.0-b7ba1d",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "long" % "4.0.0-dt-20181102Z-eca052",
  "com.scalablytyped" %%% "make-error" % "1.3.5-8880cf",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20181102Z-8bed80",
  "com.scalablytyped" %%% "mkdirp" % "0.5-dt-20181102Z-d16a31",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20181102Z-a9f008",
  "com.scalablytyped" %%% "protobufjs" % "6.8.8-4227a4",
  "com.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-0bb450",
  "com.scalablytyped" %%% "protobufjs__base64" % "1.1.2-66e78b",
  "com.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-f5e12a",
  "com.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-0cf4aa",
  "com.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-ce8b6f",
  "com.scalablytyped" %%% "protobufjs__float" % "1.0.2-7bf595",
  "com.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-4b6e52",
  "com.scalablytyped" %%% "protobufjs__path" % "1.1.2-7cea48",
  "com.scalablytyped" %%% "protobufjs__pool" % "1.1.0-c4603f",
  "com.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-d6356e",
  "com.scalablytyped" %%% "read-package-tree" % "5.2-dt-20181102Z-19b4e9",
  "com.scalablytyped" %%% "require-from-string" % "1.2-dt-20181102Z-cf60a1",
  "com.scalablytyped" %%% "source-map-support" % "0.4-dt-20181102Z-cef98d",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "ts-node" % "7.0.1-2272af",
  "com.scalablytyped" %%% "typescript" % "3.1.6-0ff591",
  "com.scalablytyped" %%% "upath" % "1.1.0-549366",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        