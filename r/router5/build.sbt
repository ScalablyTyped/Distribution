organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-c9c1de"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-7f1627",
  "org.scalablytyped" %%% "route-node" % "3.4.2-6069bf",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-34047f",
  "org.scalablytyped" %%% "search-params" % "2.1.3-f52f31",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        