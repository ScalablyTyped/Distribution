organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20200205Z-01e10d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.2-dt-20200331Z-ada1c9",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-3ffc1d",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-d7fd12",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-d59548",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-5ff1b8",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-b5ca0a",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20200407Z-199d48",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-894e2a",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-444795",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200205Z-6a2d8e",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-8d1792",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-2dcdda",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20200205Z-89936f",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200205Z-5bc9c9",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-b35dee")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
