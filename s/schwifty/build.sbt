organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20190314Z-58e9be"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.10.2-9447df",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-fef2b5",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-07848f",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-e75da5",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-5b0c20",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-8ac771",
  "org.scalablytyped" %%% "knex" % "0.18.4-0e13e7",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-cb7ee4",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-ce07fc",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190807Z-ed4b3f",
  "org.scalablytyped" %%% "objection" % "1.6.9-2bb74e",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-a07bf8",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-5f1d35",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        