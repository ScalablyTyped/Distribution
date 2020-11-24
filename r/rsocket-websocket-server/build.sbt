organization := "org.scalablytyped"
name := "rsocket-websocket-server"
version := "0.0-dt-20200515Z-3162e8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20200218Z-78efec",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20200515Z-8ddeba",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20200515Z-555993",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-fda7ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
