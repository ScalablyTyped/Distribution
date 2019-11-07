organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-5ae6c2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-4ef131",
  "org.scalablytyped" %%% "route-node" % "3.4.2-afeafa",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-167c29",
  "org.scalablytyped" %%% "search-params" % "2.1.3-7e01c2",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        