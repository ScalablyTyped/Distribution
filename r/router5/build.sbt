organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-083d58"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-32ee18",
  "org.scalablytyped" %%% "route-node" % "3.4.2-21aaf1",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-89893f",
  "org.scalablytyped" %%% "search-params" % "2.1.3-12ab7b",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        