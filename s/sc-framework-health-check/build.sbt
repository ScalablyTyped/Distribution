organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20200205Z-4ebd11"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ag-channel" % "4.0-dt-20200205Z-8c8523",
  "org.scalablytyped" %%% "ag-simple-broker" % "4.0-dt-20200205Z-33da34",
  "org.scalablytyped" %%% "async" % "3.2-dt-20200515Z-9355c4",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-3159db",
  "org.scalablytyped" %%% "async-stream-emitter" % "3.0-dt-20200205Z-019465",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-8ef17f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-72dac4",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-e13d41",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-adf080",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200515Z-d9cc4e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200624Z-cd1cc0",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-832ff5",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-39926e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200515Z-a16f63",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-ad24a7",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-7b3798",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c5e2e8",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-f17f77",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200519Z-5172bb",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-ef4f5e",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-66018e",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20200205Z-3e709f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-9b0303",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20200205Z-592e2c",
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
