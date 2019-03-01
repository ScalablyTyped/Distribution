organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-8fe50b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-949f2b",
  "org.scalablytyped" %%% "route-node" % "3.4.2-288804",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-0baee2",
  "org.scalablytyped" %%% "search-params" % "2.1.3-7489bf",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-3596cc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        