organization := "org.scalablytyped"
name := "realm"
version := "2.22.0-ae915e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-ac9f89",
  "org.scalablytyped" %%% "command-line-args" % "5.0-dt-20180503Z-64b78f",
  "org.scalablytyped" %%% "decompress" % "4.2-dt-20180610Z-37a0d4",
  "org.scalablytyped" %%% "deepmerge" % "3.1.0-ecde1e",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-82b728",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-bba065",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-b5c644",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-d86f0f",
  "org.scalablytyped" %%% "node-machine-id" % "1.1.10-639c66",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-60cf5b",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-1e65c9",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-4d2fe4",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20190104Z-b35478")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        