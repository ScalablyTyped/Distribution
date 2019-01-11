organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20180712Z-d38f7e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.2-958b1c",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-6bd481",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-f53c96",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181111Z-1ae318",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-a47544",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-42ebaa",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181212Z-7c2315",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-ed5fb2",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-7bcab6",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20181115Z-e68d8f",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-12a530",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-4f5984",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "objection" % "1.4.0-15b442",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-adcb2b",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-1e0ea5",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-f0e16c",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-ae97ae")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        