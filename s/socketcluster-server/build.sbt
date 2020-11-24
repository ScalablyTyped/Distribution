organization := "org.scalablytyped"
name := "socketcluster-server"
version := "15.0-dt-20200214Z-731f7c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ag-channel" % "4.0-dt-20200205Z-0b4e9c",
  "org.scalablytyped" %%% "ag-simple-broker" % "4.0-dt-20200205Z-5d09ee",
  "org.scalablytyped" %%% "async-stream-emitter" % "3.0-dt-20200902Z-a04c95",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-03387b",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-5237a0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-4e6bee",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20200205Z-1bde47",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200902Z-fd4102",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-78a86b",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-fda7ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
