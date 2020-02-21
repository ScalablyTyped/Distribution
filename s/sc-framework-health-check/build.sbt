organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20200205Z-b68905"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ag-channel" % "4.0-dt-20200205Z-160225",
  "org.scalablytyped" %%% "ag-simple-broker" % "4.0-dt-20200205Z-1eae1c",
  "org.scalablytyped" %%% "async" % "3.0-dt-20200128Z-c47c12",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-f3fa3b",
  "org.scalablytyped" %%% "async-stream-emitter" % "3.0-dt-20200205Z-2061df",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-cc0ef5",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-07dbf2",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-2871f4",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-c75a6b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-f4e6a1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200121Z-868c54",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-df76a2",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20200122Z-8abab0",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-4fb0bc",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-8ed998",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-7c1dac",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-502d16",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200205Z-088d93",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-f1afa6",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-ff6319",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20200205Z-10c6dd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-d83efd",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20200205Z-cdf565",
  "org.scalablytyped" %%% "socketcluster-server" % "15.0-dt-20200214Z-3014e0",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200205Z-dc48ef",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-7ac140",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200129Z-69f918")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
