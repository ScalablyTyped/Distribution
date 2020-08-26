organization := "org.scalablytyped"
name := "socketcluster-client"
version := "15.1-dt-20200624Z-24f2fc"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ag-channel" % "4.0-dt-20200205Z-262216",
  "org.scalablytyped" %%% "ag-simple-broker" % "4.0-dt-20200205Z-958670",
  "org.scalablytyped" %%% "async-stream-emitter" % "3.0-dt-20200205Z-f6f4ec",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-a09b84",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-0e59be",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-fb42dd",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20200205Z-b03f03",
  "org.scalablytyped" %%% "socketcluster-server" % "15.0-dt-20200214Z-1fceab",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200205Z-056466",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-7ca15a",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200629Z-0157fd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
