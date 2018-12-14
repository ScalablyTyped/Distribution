organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20180910Z-a54a87"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.1-99a2a0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181214Z-e561d3",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-fca4be",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-1a4427",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-8b11a1",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181214Z-86a82b",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-120cc5",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181213Z-cc59b1",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20181116Z-034da4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-f160ca",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-584e1d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "objection" % "1.4.0-40b91b",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-beab25",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181208Z-6a1d55",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-20bf5e",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-ca563f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        