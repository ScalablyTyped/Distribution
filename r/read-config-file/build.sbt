organization := "com.scalablytyped"
name := "read-config-file"
version := "3.1.2-f7889c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ajv" % "6.5.4-9e8709",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3124ce",
  "com.scalablytyped" %%% "bluebird-lst" % "1.0.5-f4447e",
  "com.scalablytyped" %%% "dotenv" % "6.1-dt-20181109Z-139d8b",
  "com.scalablytyped" %%% "dotenv-expand" % "4.2.0-e7e7ab",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "fast-deep-equal" % "2.0.1-ef0253",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-9b03c0",
  "com.scalablytyped" %%% "fs-extra-p" % "4.6.1-909f0f",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-fd3121",
  "com.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180910Z-6e2bd3",
  "com.scalablytyped" %%% "lazy-val" % "1.0.3-501d39",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "uri-js" % "4.2.2-32727b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        