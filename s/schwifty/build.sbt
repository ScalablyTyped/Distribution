organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20190314Z-649973"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-4b0839",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-d84c1e",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-986805",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-bd3199",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-6773cd",
  "org.scalablytyped" %%% "chalk" % "2.4.2-ca1e30",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-5a34a6",
  "org.scalablytyped" %%% "commander" % "2.19.0-4db880",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-faeaa3",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-42ef87",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-82585c",
  "org.scalablytyped" %%% "fined" % "1.1-dt-20190212Z-9ce3ac",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-9f27f4",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20190322Z-75670b",
  "org.scalablytyped" %%% "interpret" % "1.1-dt-20190212Z-dcb20e",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-f14200",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-86a92a",
  "org.scalablytyped" %%% "knex" % "0.16.3-445c67",
  "org.scalablytyped" %%% "liftoff" % "2.5-dt-20181206Z-4f5b6f",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190329Z-69a948",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-ea22a6",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-dedbe7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-8cca44",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-6520aa",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "objection" % "1.6.6-0e094b",
  "org.scalablytyped" %%% "pg-connection-string" % "2.0.0-2a8abc",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-e48ffc",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-63baaa",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-7f8f87",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-1b70da",
  "org.scalablytyped" %%% "tildify" % "1.2-dt-20181206Z-9a78ae",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-8cad7e",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-6db83f",
  "org.scalablytyped" %%% "v8flags" % "3.1-dt-20190212Z-0b14eb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        