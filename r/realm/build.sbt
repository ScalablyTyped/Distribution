organization := "org.scalablytyped"
name := "realm"
version := "2.21.1-c35beb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-a94dbd",
  "org.scalablytyped" %%% "command-line-args" % "5.0-dt-20180910Z-ce5c49",
  "org.scalablytyped" %%% "decompress" % "4.2-dt-20180910Z-6765eb",
  "org.scalablytyped" %%% "deepmerge" % "3.0.0-487e70",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-26a7b4",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-624f1c",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181129Z-35a1a5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-d32d36",
  "org.scalablytyped" %%% "node-machine-id" % "1.1.10-5d8cbc",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181214Z-65ba00",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-32d5ea",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-ee0213",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-eb91fb",
  "org.scalablytyped" %%% "url-parse" % "1.4-dt-20180910Z-b7b5bf")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        