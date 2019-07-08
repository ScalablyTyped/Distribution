organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-13e14c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-2a431a",
  "org.scalablytyped" %%% "route-node" % "3.4.2-96f8f5",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-347da8",
  "org.scalablytyped" %%% "search-params" % "2.1.3-b4a18f",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        