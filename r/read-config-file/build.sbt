organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.0-eb1f5a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.2-95b01f",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-8f594d",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-f8035b",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-e4927f",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-6e56c9",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-dc1557",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-904c02",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-9e8f6d",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-af656e",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-67ede6",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-a97803",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-d61f0d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-5fd723",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-68b43e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        