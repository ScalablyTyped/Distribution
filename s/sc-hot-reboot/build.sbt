organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20200205Z-2c83c0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ag-channel" % "4.0-dt-20200205Z-60de29",
  "org.scalablytyped" %%% "ag-simple-broker" % "4.0-dt-20200205Z-0dc2f3",
  "org.scalablytyped" %%% "async" % "3.0-dt-20200128Z-ae7eaa",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-3ffc1d",
  "org.scalablytyped" %%% "async-stream-emitter" % "3.0-dt-20200205Z-b339e3",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-c1eb4e",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-d59548",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-5ff1b8",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-b5ca0a",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20200122Z-be217b",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-cf7c16",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-b63b84",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200205Z-849e5b",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-9c6c60",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-2dcdda",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20200205Z-9fe276",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20200205Z-40b75a",
  "org.scalablytyped" %%% "socketcluster-server" % "15.0-dt-20200214Z-060f67",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200205Z-5bc9c9",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-b35dee",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200129Z-9e5eae")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
