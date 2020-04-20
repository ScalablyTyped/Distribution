organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20191105Z-c06685"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.12.1-62eeb2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200226Z-e98120",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-e26bff",
  "org.scalablytyped" %%% "db-errors" % "0.2.3-8a8fe2",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200227Z-dc6d2a",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-74c478",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20200227Z-ad8611",
  "org.scalablytyped" %%% "knex" % "0.20.15-d8aa1f",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20200330Z-8b3e50",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20200330Z-876f6d",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "objection" % "2.1.3-a8c6e0",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20200225Z-8c1d2b",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-d7c346",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "tarn" % "2.0.0-38004c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
