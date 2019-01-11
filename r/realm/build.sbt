organization := "org.scalablytyped"
name := "realm"
version := "2.22.0-05f258"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-b68dab",
  "org.scalablytyped" %%% "command-line-args" % "5.0-dt-20180503Z-82cf30",
  "org.scalablytyped" %%% "decompress" % "4.2-dt-20180610Z-aacad5",
  "org.scalablytyped" %%% "deepmerge" % "3.0.0-b058e5",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-9cf838",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-a75f26",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-5d2bab",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-3967d2",
  "org.scalablytyped" %%% "node-machine-id" % "1.1.10-b56ddc",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-0dae05",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-ff1a88",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-a362a9",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-b0f6d7",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20190104Z-3e6b0b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        