organization := "org.scalablytyped"
name := "rx-jquery"
version := "0.0-unknown-dt-20200227Z-950aa7"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200225Z-e64e66",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200225Z-0759c8",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20200225Z-5aab2c",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20200225Z-6ec3ef",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20200225Z-3dd54b",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20200225Z-1e6fa1",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20200225Z-8683a8",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20200225Z-dab2d6",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20200225Z-7355c2",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20200225Z-cc532d",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20200225Z-13c555",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20200225Z-a2df11",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20200225Z-9814df",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-3d9ead",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
