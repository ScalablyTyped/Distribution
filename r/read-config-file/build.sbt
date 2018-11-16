organization := "com.scalablytyped"
name := "read-config-file"
version := "3.1.3-136c29"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ajv" % "6.5.4-db8cdc",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20181102Z-6d07df",
  "com.scalablytyped" %%% "bluebird-lst" % "1.0.6-674cc9",
  "com.scalablytyped" %%% "dotenv" % "6.1-dt-20181109Z-94743d",
  "com.scalablytyped" %%% "dotenv-expand" % "4.2.0-23b06b",
  "com.scalablytyped" %%% "fast-deep-equal" % "2.0.1-dcdec4",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20181102Z-49c518",
  "com.scalablytyped" %%% "fs-extra-p" % "7.0.0-69a5d1",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20181102Z-0a1057",
  "com.scalablytyped" %%% "json5" % "0.0-unknown-dt-20181102Z-cdc398",
  "com.scalablytyped" %%% "lazy-val" % "1.0.3-b52ec8",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "uri-js" % "4.2.2-e7a1dc",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        