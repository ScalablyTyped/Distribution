organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20180712Z-97496a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.8.1-17ddd9",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-f01776",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-344433",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190126Z-804551",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-2cff45",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-f8efaa",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190119Z-5f46b7",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-25794c",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190131Z-6a437a",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20181115Z-dfc0a1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-b2cae6",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-086af5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "objection" % "1.5.3-9e991f",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-7174cc",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-0009b8",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-1f92c4",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-194416")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        