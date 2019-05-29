organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-97ee34"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-6df075",
  "org.scalablytyped" %%% "route-node" % "3.4.2-7a38cc",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-ca2643",
  "org.scalablytyped" %%% "search-params" % "2.1.3-b1b608",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        