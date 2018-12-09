organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.0-b99860"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.1-529687",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-b88fdf",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-460360",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181109Z-71d1a2",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-fdd8a7",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-0a22d4",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-4e7716",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-0b071e",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-0e1a20",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180910Z-24c2f9",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-82e4de",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181208Z-6a1d55",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-ca563f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        