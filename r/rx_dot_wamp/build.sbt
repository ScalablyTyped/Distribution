organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20200225Z-abc7e6"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "autobahn" % "18.10-dt-20200225Z-36113b",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200225Z-e0911e",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20200225Z-fd3a32",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20200225Z-6410c9",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20200225Z-7a77a6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
