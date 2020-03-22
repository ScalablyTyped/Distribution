organization := "org.scalablytyped"
name := "router5"
version := "8.0.1-beeb0d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "path-parser" % "6.1.0-939e3e",
  "org.scalablytyped" %%% "route-node" % "4.1.1-8d961c",
  "org.scalablytyped" %%% "router5-transition-path" % "8.0.1-3c2331",
  "org.scalablytyped" %%% "search-params" % "3.0.0-7ff495",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
