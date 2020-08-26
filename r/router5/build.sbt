organization := "org.scalablytyped"
name := "router5"
version := "8.0.1-a84314"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "path-parser" % "6.1.0-60ec03",
  "org.scalablytyped" %%% "route-node" % "4.1.1-c69ba4",
  "org.scalablytyped" %%% "router5-transition-path" % "8.0.1-b3a4fe",
  "org.scalablytyped" %%% "search-params" % "3.0.0-ce0bf0",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
