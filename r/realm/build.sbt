organization := "com.scalablytyped"
name := "realm"
version := "2.18.0-e854b0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-7ce57e",
  "com.scalablytyped" %%% "command-line-args" % "5.0-dt-20180910Z-e7d4db",
  "com.scalablytyped" %%% "decompress" % "4.2-dt-20180910Z-8a68bd",
  "com.scalablytyped" %%% "deepmerge" % "2.2.1-9b2a57",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-24b452",
  "com.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-61412b",
  "com.scalablytyped" %%% "ini" % "v1.3.3-dt-20180910Z-d4fedb",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-de4761",
  "com.scalablytyped" %%% "progress" % "v2.0.0-dt-20180910Z-7d4659",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-7b533e",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-34d8d7",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-a9e24d",
  "com.scalablytyped" %%% "url-parse" % "1.4-dt-20180910Z-841b81",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        