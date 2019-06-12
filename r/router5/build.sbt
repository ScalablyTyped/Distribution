organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-c4c3f8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-0a09f3",
  "org.scalablytyped" %%% "route-node" % "3.4.2-a91fad",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-c8e732",
  "org.scalablytyped" %%% "search-params" % "2.1.3-eb9d63",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        