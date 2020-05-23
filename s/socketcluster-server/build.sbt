organization := "org.scalablytyped"
name := "socketcluster-server"
version := "15.0-dt-20200214Z-0658e1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async-stream-emitter" % "3.0-dt-20200205Z-cb74be",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-e5a4b4",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-88793d",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-633f3f",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20200205Z-490554",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200205Z-6f74a2",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-268d7f",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200413Z-19ac01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
