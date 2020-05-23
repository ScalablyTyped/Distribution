organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "9.0-dt-20200205Z-b688dd"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.2-dt-20200515Z-6fd56a",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-574aa7",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-e5a4b4",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-d8ed07",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-4658ca",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-f2af9b",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200519Z-7e1092",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-2638e2",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200205Z-6f74a2",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-268d7f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
