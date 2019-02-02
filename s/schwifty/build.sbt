organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20180712Z-414761"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.7.0-9e8624",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-ef7d03",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-d14003",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190126Z-5d7ee5",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-57e227",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ddf996",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190119Z-5e94a1",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-3917a5",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190131Z-30077a",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20181115Z-b7270b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-985e34",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-6afcaa",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "objection" % "1.5.3-aec670",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-b757dc",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-82f2e3",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-26cfb7",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-df3f4a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        