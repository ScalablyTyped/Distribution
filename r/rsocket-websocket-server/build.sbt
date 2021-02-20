organization := "org.scalablytyped"
name := "rsocket-websocket-server"
version := "0.0-dt-20200515Z-44cb77"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20200218Z-e5e70d",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20200515Z-87bd7d",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20200515Z-db6d5c",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-9df179")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
