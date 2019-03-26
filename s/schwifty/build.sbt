organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20190314Z-53c282"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-7799d3",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-749fa6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-d754c7",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-85911d",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-2fac78",
  "org.scalablytyped" %%% "chalk" % "2.4.2-3344ae",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-7e7317",
  "org.scalablytyped" %%% "commander" % "2.19.0-708743",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-e59bbf",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-0fc5fc",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-cbad63",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-130897",
  "org.scalablytyped" %%% "fined" % "1.1-dt-20190212Z-55cc7f",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-b3bc95",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20190322Z-2a9acd",
  "org.scalablytyped" %%% "interpret" % "1.1-dt-20190212Z-eb7612",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-c90b69",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-e908c8",
  "org.scalablytyped" %%% "knex" % "0.16.3-c7b401",
  "org.scalablytyped" %%% "liftoff" % "2.5-dt-20181206Z-1bc6c3",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-aebc2d",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-9779a1",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-2ad77d",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-727fc1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "objection" % "1.6.4-6fc616",
  "org.scalablytyped" %%% "pg-connection-string" % "2.0.0-381ff3",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-c1eb16",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-6f3a8b",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-6e9894",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-b01a75",
  "org.scalablytyped" %%% "tildify" % "1.2-dt-20181206Z-c643ca",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-d68e3d",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-43c72f",
  "org.scalablytyped" %%% "v8flags" % "3.1-dt-20190212Z-1c475b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        