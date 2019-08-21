organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20190314Z-40a849"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.10.2-c3fb5c",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-abd1a2",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-2cac09",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-3bc36d",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-ecf77c",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-57592b",
  "org.scalablytyped" %%% "knex" % "0.18.4-584070",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-05dd4d",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-39cfe3",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "objection" % "1.6.9-5d695f",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-9ec145",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-d5fbf2",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        