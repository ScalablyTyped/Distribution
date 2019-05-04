organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20190314Z-e98db4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ajv" % "6.10.0-7b460f",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-aac16e",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-745bd0",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-c8b399",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-919b13",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-0f7bef",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-c4b8ce",
  "org.scalablytyped" %%% "knex" % "0.16.5-f48226",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-279468",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-04bd28",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-6753fb",
  "org.scalablytyped" %%% "objection" % "1.6.8-990c4b",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-feec7c",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-b82f3b",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        