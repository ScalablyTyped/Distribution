organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.2-156f9f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-7799d3",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-d754c7",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.7-89d29c",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-cf6970",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-b284fc",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-cbad63",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-130897",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-6662de",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-cff3d2",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-26cfe6",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20190322Z-64b371",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-678c2e",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-6f3a8b",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-d68e3d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        