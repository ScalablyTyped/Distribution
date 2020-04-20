organization := "org.scalablytyped"
name := "rsocket-websocket-server"
version := "0.0-dt-20200327Z-9ab7ef"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20200218Z-e06e2e",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20200404Z-27f88b",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20200225Z-02c601",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200413Z-deeaca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
