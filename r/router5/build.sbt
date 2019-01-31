organization := "org.scalablytyped"
name := "router5"
version := "7.0.1-e266e2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-d647ff",
  "org.scalablytyped" %%% "route-node" % "3.4.2-3ee62b",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.0-f795ca",
  "org.scalablytyped" %%% "search-params" % "2.1.3-2f08de",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-607a2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        