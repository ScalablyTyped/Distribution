organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.1-acae94"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-76e8a2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-865309",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.7-7ee39d",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-1656e3",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-fb6302",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-cad354",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-0e5462",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-f2a81d",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-997814",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-f1d446",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-9c8115",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-26f46d",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-0a8f8e",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-e6a6c5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        