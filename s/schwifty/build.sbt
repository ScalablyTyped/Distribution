organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20180712Z-23cb9c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.7.0-3699e1",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a8dc26",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-34ff31",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181111Z-60b9fe",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-ceddfc",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-c8d4b8",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181212Z-9e7376",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-80f03c",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-34f834",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20181115Z-8c1f38",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-8d1804",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-e4ffa9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "objection" % "1.4.0-371163",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-69aed2",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-6755f9",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-f822b0",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-c4241a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        