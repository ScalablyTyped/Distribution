organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-8cb333"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-4549c7",
  "org.scalablytyped" %%% "route-node" % "3.4.2-e8c0d9",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-2fcd0a",
  "org.scalablytyped" %%% "search-params" % "2.1.3-fcd380",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        