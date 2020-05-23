organization := "org.scalablytyped"
name := "relay-config"
version := "6.0-dt-20200515Z-154d74"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "graphql" % "14.6.0-2fa9e2",
  "org.scalablytyped" %%% "relay-compiler" % "8.0-dt-20200515Z-0af80c",
  "org.scalablytyped" %%% "relay-runtime" % "8.0-dt-20200519Z-2728c4",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
