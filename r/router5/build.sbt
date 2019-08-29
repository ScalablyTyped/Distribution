organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-088e76"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-64b8ef",
  "org.scalablytyped" %%% "route-node" % "3.4.2-df273c",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-27586e",
  "org.scalablytyped" %%% "search-params" % "2.1.3-9c4e46",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        