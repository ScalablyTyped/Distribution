organization := "org.scalablytyped"
name := "realm"
version := "2.26.1-779ec8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-67548d",
  "org.scalablytyped" %%% "command-line-args" % "5.0-dt-20180503Z-48f26c",
  "org.scalablytyped" %%% "decompress" % "4.2-dt-20180610Z-9e71b3",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-a1baa5",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-79e87a",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d1d8d8",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20190322Z-654e49",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "node-fetch" % "2.3-dt-20190411Z-5a2eed",
  "org.scalablytyped" %%% "node-machine-id" % "1.1.10-6b1f76",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20190322Z-f435dc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-8e6847",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-972cef",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20190205Z-4d5163")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        