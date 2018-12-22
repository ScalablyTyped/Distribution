organization := "org.scalablytyped"
name := "protobufjs"
version := "6.8.8-8af596"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-a0b1b2",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-eb4ed7",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-8265ef",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-a9eb67",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-b99416",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-c7db0b",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-29d2d9",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-db95a2",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-65a6ba",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-4b21fc",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-21d69c",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        