organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.0-f2abe7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.1-a70ce9",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-98d464",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-920ba9",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181109Z-48ad7d",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-0a7334",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-f9cead",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180910Z-57e2a1",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-872d3d",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-190fee",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180910Z-018c86",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-63f213",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181208Z-0a9ba8",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-6f00bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        