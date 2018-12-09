organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20180910Z-217194"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.1-529687",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-b88fdf",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-fca4be",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-1a4427",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-0a22d4",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181129Z-06ab9c",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-f1d85c",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181031Z-4c4c5e",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20181116Z-cccf41",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-f160ca",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-584e1d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "objection" % "1.4.0-01fb7f",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-beab25",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181208Z-6a1d55",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-8d66c3",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-ca563f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        