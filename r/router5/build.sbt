organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-7a461c"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-289e8d",
  "org.scalablytyped" %%% "route-node" % "3.4.2-ce378c",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-f109ba",
  "org.scalablytyped" %%% "search-params" % "2.1.3-c67c2e",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        