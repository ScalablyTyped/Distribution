organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20190314Z-99fe14"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ajv" % "6.10.0-a16946",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-1ea477",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-52dbd1",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-4b9922",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-c6d9ff",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-4f51e4",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-3845f7",
  "org.scalablytyped" %%% "knex" % "0.17.6-0e8ed7",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-166c9f",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-698145",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "objection" % "1.6.9-66bd93",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-ad34dd",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-502e15",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        