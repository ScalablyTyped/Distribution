organization := "org.scalablytyped"
name := "socketcluster"
version := "14.0-dt-20200205Z-43ead3"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async" % "3.2-dt-20201112Z-c0d7ca",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-766947",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-cc8470",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-c64a85",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-120917",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-266be0",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-65d02a",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-924dba",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200519Z-35c5ee",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-b1e929",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-afc1b4",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200902Z-724a0c",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-1608e4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
