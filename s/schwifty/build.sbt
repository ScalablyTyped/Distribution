organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20190314Z-af57ac"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ajv" % "6.10.0-46610e",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-462670",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-5e1bbe",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-901851",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-e106ba",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-c5d9a0",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-51779d",
  "org.scalablytyped" %%% "knex" % "0.17.0-4fe239",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-2bedcf",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-85fdc8",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-2c614a",
  "org.scalablytyped" %%% "objection" % "1.6.9-dc7d9f",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-97f9dc",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-ef9f63",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        