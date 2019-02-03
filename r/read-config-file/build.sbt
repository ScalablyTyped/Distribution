organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.1-41d6be"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.8.1-9e8624",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-ef7d03",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-053f79",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-48b9e5",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-f94605",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-57e227",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ddf996",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-585a5f",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-4a413b",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-6e1cbe",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-edb1e0",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-88a052",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-82f2e3",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-df3f4a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        