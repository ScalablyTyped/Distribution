organization := "org.scalablytyped"
name := "router5"
version := "8.0.1-fffe76"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "path-parser" % "6.1.0-a7e4cf",
  "org.scalablytyped" %%% "route-node" % "4.1.1-0d4523",
  "org.scalablytyped" %%% "router5-transition-path" % "8.0.1-7da226",
  "org.scalablytyped" %%% "search-params" % "3.0.0-59d5be",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
