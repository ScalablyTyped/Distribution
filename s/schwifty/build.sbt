organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20180712Z-32b698"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.2-2b33e8",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-03fd26",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-5d8985",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181111Z-d70402",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-ccba98",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-353ee5",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181212Z-b7075e",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-32ae0c",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-62be1d",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20181115Z-7de8bf",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-3d29af",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-576227",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "objection" % "1.4.0-f653ed",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-00460f",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-3650a8",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-9b0bee",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-3ee6a4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        