organization := "org.scalablytyped"
name := "socketcluster"
version := "14.0-dt-20200205Z-7733a7"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ag-channel" % "4.0-dt-20200205Z-6b5584",
  "org.scalablytyped" %%% "ag-simple-broker" % "4.0-dt-20200205Z-5dbe16",
  "org.scalablytyped" %%% "async" % "3.2-dt-20200331Z-50b9ee",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-3951d8",
  "org.scalablytyped" %%% "async-stream-emitter" % "3.0-dt-20200205Z-8c6587",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-660e1d",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-822e23",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-67a587",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20200407Z-0831ed",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-5e40a0",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-4470a5",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200205Z-0ff641",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-a8781f",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-3f6965",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20200205Z-5f0bae",
  "org.scalablytyped" %%% "socketcluster-server" % "15.0-dt-20200214Z-5eb28b",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200205Z-780cf2",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-d9e875",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200413Z-deeaca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
