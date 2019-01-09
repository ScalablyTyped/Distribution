organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20180712Z-9ca548"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.2-80a59c",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a33d29",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-81bdfb",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181111Z-5f4ff6",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-fda359",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-d227f7",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181212Z-62949f",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-8bacc5",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-90d510",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20181115Z-ff7b9b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-d60f14",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-d57943",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "objection" % "1.4.0-d47485",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-495653",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-7a79c0",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-836fbb",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-6a758d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        