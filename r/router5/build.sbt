organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-1b7f84"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-c24ef2",
  "org.scalablytyped" %%% "route-node" % "3.4.2-49647e",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-dd71c2",
  "org.scalablytyped" %%% "search-params" % "2.1.3-1a7548",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        