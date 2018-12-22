organization := "org.scalablytyped"
name := "realm"
version := "2.21.1-440ff0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-e33499",
  "org.scalablytyped" %%% "command-line-args" % "5.0-dt-20180503Z-48be9e",
  "org.scalablytyped" %%% "decompress" % "4.2-dt-20180610Z-4b0adc",
  "org.scalablytyped" %%% "deepmerge" % "3.0.0-7c5ed6",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-bda47a",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-9e8f6d",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-fb93f7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-d6edb6",
  "org.scalablytyped" %%% "node-machine-id" % "1.1.10-6c842f",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-9b4ac8",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-3109dd",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2246af",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a6a64a",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20180725Z-096936")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        