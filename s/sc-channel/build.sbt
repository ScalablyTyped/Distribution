organization := "org.scalablytyped"
name := "sc-channel"
version := "2.0-dt-20200205Z-66018e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-3159db",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-e13d41",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200205Z-6816a6",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-6786ac")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
