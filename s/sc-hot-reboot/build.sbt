organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20200205Z-899919"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.2-dt-20201112Z-d19ec2",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-53c465",
  "org.scalablytyped" %%% "chokidar" % "3.4.3-7dd4e3",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-03387b",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-4b49b6",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-5a5619",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-5237a0",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-db1422",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-4e6bee",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200519Z-36399e",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-1a7f96",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-0c173e",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20200205Z-4b5a08",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200902Z-fd4102",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-78a86b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
