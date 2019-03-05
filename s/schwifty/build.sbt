organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20180712Z-c7a1d2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-76e8a2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-865309",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-b57e54",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-412fb8",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-cad354",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-0e5462",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-bf9b70",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-65b69e",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-916abe",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20190228Z-b66e43",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-645bab",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-66ec6e",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "objection" % "1.6.3-92f2c5",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-b722ee",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-0a8f8e",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-ecccc7",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-e6a6c5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        