organization := "com.scalablytyped"
name := "realm"
version := "2.20.1-a637b2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-2bf221",
  "com.scalablytyped" %%% "command-line-args" % "5.0-dt-20180910Z-37061c",
  "com.scalablytyped" %%% "decompress" % "4.2-dt-20180910Z-8e3ae3",
  "com.scalablytyped" %%% "deepmerge" % "2.2.1-d0c656",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-b1edcb",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-748b3b",
  "com.scalablytyped" %%% "ini" % "v1.3.3-dt-20181129Z-b9b7a3",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-654656",
  "com.scalablytyped" %%% "node-machine-id" % "1.1.10-5081d6",
  "com.scalablytyped" %%% "progress" % "v2.0.0-dt-20180910Z-797887",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-fa2110",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-65a037",
  "com.scalablytyped" %%% "url-parse" % "1.4-dt-20180910Z-c3c2e8",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        