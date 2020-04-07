organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20191105Z-d4fd43"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.12.0-4a5655",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200226Z-efa725",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-f30551",
  "org.scalablytyped" %%% "db-errors" % "0.2.3-618274",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200227Z-339e31",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-faf6f6",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20200227Z-0b3433",
  "org.scalablytyped" %%% "knex" % "0.20.12-3907b5",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-574028",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20200225Z-327e15",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "objection" % "2.1.3-edadfa",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20200225Z-4a23e4",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-bf1934",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tarn" % "2.0.0-754b9d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
