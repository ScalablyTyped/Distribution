organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.0-f7259d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.2-2b33e8",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-03fd26",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-95ab1e",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-bc860f",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-969de3",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-ccba98",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-353ee5",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-31009f",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-7d565d",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-43e82c",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-c8a4e4",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-0bc3ab",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-3650a8",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-3ee6a4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        