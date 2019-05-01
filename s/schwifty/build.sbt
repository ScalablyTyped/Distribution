organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20190314Z-f9780f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ajv" % "6.10.0-d2fdeb",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-0bae51",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-1637e5",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-1b00d1",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-8b3f2f",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-0d824e",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-536314",
  "org.scalablytyped" %%% "knex" % "0.16.5-7818dc",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-38d1ba",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-ec220e",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "objection" % "1.6.8-a75cd3",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-a87603",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-04bcdd",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        