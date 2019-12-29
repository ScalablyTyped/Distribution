organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-75bca2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-c3d5ad",
  "org.scalablytyped" %%% "route-node" % "3.4.2-19d9b7",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-88fe20",
  "org.scalablytyped" %%% "search-params" % "2.1.3-68578a",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        