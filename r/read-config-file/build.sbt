organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.2-f40af2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-4b0839",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-986805",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.7-55a535",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20190329Z-c7bb73",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-d02394",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-42ef87",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-82585c",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d1d8d8",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-430384",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190402Z-168e26",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20190322Z-f9fe84",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-eeaaa8",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-63baaa",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-8cad7e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        