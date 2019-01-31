organization := "org.scalablytyped"
name := "protobufjs"
version := "6.8.8-7966c6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-e44ec3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-c09989",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-991424",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-e42de9",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-e729e8",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-27c8f0",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-bf95d8",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-4a99f0",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-01c06c",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-503643",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-6d707c",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        