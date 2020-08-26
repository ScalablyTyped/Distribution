organization := "org.scalablytyped"
name := "rsocket-websocket-server"
version := "0.0-dt-20200515Z-8cbe7e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20200218Z-b847d2",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20200515Z-dfb24b",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20200515Z-30008a",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200629Z-0157fd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
