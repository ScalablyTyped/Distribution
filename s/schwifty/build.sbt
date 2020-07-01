organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20191105Z-0db0fc"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ajv" % "6.12.2-620863",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200515Z-9f2b58",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-7b1f50",
  "org.scalablytyped" %%% "db-errors" % "0.2.3-4742b4",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20200515Z-2eaaf3",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-3f625a",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20200515Z-c964b8",
  "org.scalablytyped" %%% "knex" % "0.20.15-137a82",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-5778e6",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20200515Z-031497",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "objection" % "2.2.0-54b585",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20200515Z-c7adf5",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-656982",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "tarn" % "2.0.0-bb59e6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
