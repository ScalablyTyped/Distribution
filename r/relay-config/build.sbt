organization := "org.scalablytyped"
name := "relay-config"
version := "6.0-dt-20200515Z-c2a64d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "graphql" % "15.3.0-ff42a4",
  "org.scalablytyped" %%% "relay-compiler" % "8.0-dt-20200515Z-5b8846",
  "org.scalablytyped" %%% "relay-runtime" % "10.0-dt-20200715Z-bc3042",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
