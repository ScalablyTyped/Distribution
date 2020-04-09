organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20200205Z-303393"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.2-dt-20200331Z-ada1c9",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-3ffc1d",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-777753",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-26d1e9",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-d59548",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-5ff1b8",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200331Z-79bd5c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200323Z-88b703",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-b5ca0a",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20200407Z-199d48",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-894e2a",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200225Z-e66ac9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-444795",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200205Z-6a2d8e",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-8d1792",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-2dcdda",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-e748ee",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20200205Z-89936f",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200205Z-5bc9c9",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-b35dee")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
