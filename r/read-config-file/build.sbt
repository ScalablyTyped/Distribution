organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.0-5d3551"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.2-958b1c",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-6bd481",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-58dc1d",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-be1c74",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-663bd0",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-a47544",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-42ebaa",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-95ed7f",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-57e80f",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-06ecaa",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-ef4759",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-58f732",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-1e0ea5",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-ae97ae")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        