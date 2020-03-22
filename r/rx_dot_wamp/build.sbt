organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20200225Z-a311bf"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "autobahn" % "18.10-dt-20200225Z-d7fe9b",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200225Z-0759c8",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20200225Z-6ec3ef",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20200225Z-3dd54b",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20200225Z-533a6d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
