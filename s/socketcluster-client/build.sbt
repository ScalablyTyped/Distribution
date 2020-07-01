organization := "org.scalablytyped"
name := "socketcluster-client"
version := "15.1-dt-20200624Z-7cb311"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ag-channel" % "4.0-dt-20200205Z-8c8523",
  "org.scalablytyped" %%% "ag-simple-broker" % "4.0-dt-20200205Z-33da34",
  "org.scalablytyped" %%% "async-stream-emitter" % "3.0-dt-20200205Z-019465",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-e13d41",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-39926e",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-f17f77",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20200205Z-3e709f",
  "org.scalablytyped" %%% "socketcluster-server" % "15.0-dt-20200214Z-bc4cce",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200205Z-6816a6",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-6786ac",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200629Z-e2bf41")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
