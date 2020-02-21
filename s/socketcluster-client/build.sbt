organization := "org.scalablytyped"
name := "socketcluster-client"
version := "15.1-dt-20200214Z-86a95b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ag-channel" % "4.0-dt-20200205Z-160225",
  "org.scalablytyped" %%% "ag-simple-broker" % "4.0-dt-20200205Z-1eae1c",
  "org.scalablytyped" %%% "async-stream-emitter" % "3.0-dt-20200205Z-2061df",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-2871f4",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20200122Z-8abab0",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-502d16",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20200205Z-10c6dd",
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
