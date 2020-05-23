organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20200205Z-02b853"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.2-dt-20200515Z-6fd56a",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-574aa7",
  "org.scalablytyped" %%% "chokidar" % "3.4.0-81d9ae",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-e5a4b4",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-d8ed07",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-4658ca",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-88793d",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-f2af9b",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-633f3f",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200519Z-7e1092",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-b688dd",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-2638e2",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20200205Z-7fe55a",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200205Z-6f74a2",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-268d7f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
