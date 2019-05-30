organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-19071d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-349478",
  "org.scalablytyped" %%% "route-node" % "3.4.2-a4bbc3",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-5f01ce",
  "org.scalablytyped" %%% "search-params" % "2.1.3-b0efe1",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        