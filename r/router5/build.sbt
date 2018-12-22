organization := "org.scalablytyped"
name := "router5"
version := "7.0.1-1b15dc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-5eb0d8",
  "org.scalablytyped" %%% "route-node" % "3.4.2-efb969",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.0-f909ad",
  "org.scalablytyped" %%% "search-params" % "2.1.3-a9a8fc",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-43e3c6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        