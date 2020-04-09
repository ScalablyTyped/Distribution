organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20191105Z-56ad72"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.12.0-4a5655",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200226Z-efa725",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-f30551",
  "org.scalablytyped" %%% "db-errors" % "0.2.3-618274",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200227Z-962d5a",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-6d19c9",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20200227Z-0b3433",
  "org.scalablytyped" %%% "knex" % "0.20.13-309c1a",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20200330Z-b5288f",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20200330Z-7d52fa",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "objection" % "2.1.3-493fac",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20200225Z-4a23e4",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-59e955",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tarn" % "2.0.0-5caeae")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
