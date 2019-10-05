organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-81b8e1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-eb31bb",
  "org.scalablytyped" %%% "route-node" % "3.4.2-0c215c",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-b2c36d",
  "org.scalablytyped" %%% "search-params" % "2.1.3-62b8bd",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        