organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20180910Z-01317a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.2-5904fe",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181214Z-21934a",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-678fe2",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-9fafc7",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-55b1a8",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181214Z-db04f6",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-1fc1dc",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181213Z-9b3760",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20181116Z-fa79e5",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-90fc20",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-66eb34",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "objection" % "1.4.0-1b2d35",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-7ccab7",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181208Z-06df8d",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-878ba9",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-535255")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        