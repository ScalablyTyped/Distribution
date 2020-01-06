organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20191105Z-09308c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.10.2-c01041",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-aa101c",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-6b2b90",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20191115Z-069ef0",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-e6186e",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-71d4bf",
  "org.scalablytyped" %%% "knex" % "0.19.5-a335b0",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-55b31a",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-3bdf23",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "objection" % "1.6.11-71cf2d",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-0dcaae",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-80299b",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        