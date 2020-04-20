organization := "org.scalablytyped"
name := "rx-jquery"
version := "0.0-unknown-dt-20200227Z-40b754"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200415Z-e1b00b",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200225Z-e0911e",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20200225Z-4cdd03",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20200225Z-fd3a32",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20200225Z-6410c9",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20200225Z-107fc6",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20200225Z-c9c86a",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20200225Z-2d4113",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20200225Z-786ac4",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20200225Z-d3d809",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20200225Z-0b99d5",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20200225Z-6cd69a",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20200225Z-aea127",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-ca8578",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
