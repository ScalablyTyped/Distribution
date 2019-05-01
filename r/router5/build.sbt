organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-036baf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-76ccdb",
  "org.scalablytyped" %%% "route-node" % "3.4.2-484fa9",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-cf0573",
  "org.scalablytyped" %%% "search-params" % "2.1.3-71541b",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        