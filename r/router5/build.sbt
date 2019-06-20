organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-614ea8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-80b8f8",
  "org.scalablytyped" %%% "route-node" % "3.4.2-66dd8c",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-100814",
  "org.scalablytyped" %%% "search-params" % "2.1.3-5ca0a6",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        