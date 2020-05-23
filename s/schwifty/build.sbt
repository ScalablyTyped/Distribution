organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20191105Z-0937b5"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.12.2-e8ea47",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200515Z-c922ee",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-5d07c9",
  "org.scalablytyped" %%% "db-errors" % "0.2.3-1d082e",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200515Z-552717",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-7b393d",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20200515Z-89560b",
  "org.scalablytyped" %%% "knex" % "0.20.15-047430",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-ce2530",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20200515Z-36c444",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "objection" % "2.1.3-81c9c3",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20200515Z-9090cb",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-5c9084",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "tarn" % "2.0.0-3dad89")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
