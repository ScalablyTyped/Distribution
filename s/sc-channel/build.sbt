organization := "org.scalablytyped"
name := "sc-channel"
version := "2.0-dt-20200205Z-2f29e2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-d70564",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-ec9d89",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200902Z-4f8e22",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-c0bbb9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
