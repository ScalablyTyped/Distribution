organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.0-e6e649"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.2-80a59c",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a33d29",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-8b7314",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-3a6aaa",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-5f5375",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-fda359",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-d227f7",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-a75f26",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-d4ee71",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-3d9c80",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-9ad826",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-5da1b4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-7a79c0",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-6a758d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        