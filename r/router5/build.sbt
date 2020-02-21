organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-7ea439"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-192ad6",
  "org.scalablytyped" %%% "route-node" % "3.4.2-033984",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-023da3",
  "org.scalablytyped" %%% "search-params" % "2.1.3-95ad44",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
