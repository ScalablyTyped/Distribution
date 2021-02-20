organization := "org.scalablytyped"
name := "socketcluster-client"
version := "15.1-dt-20201028Z-55dfe2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "ag-channel" % "4.0-dt-20200205Z-c1aff0",
  "org.scalablytyped" %%% "ag-simple-broker" % "4.0-dt-20200205Z-2f8bb1",
  "org.scalablytyped" %%% "async-stream-emitter" % "3.0-dt-20200902Z-9f1c49",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-ec9d89",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-aa4f2d",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-81e63f",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20200205Z-227fd8",
  "org.scalablytyped" %%% "socketcluster-server" % "15.0-dt-20200214Z-f6bc39",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200902Z-4f8e22",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-c0bbb9",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-9df179")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
