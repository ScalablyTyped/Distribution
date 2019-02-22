organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-cad8d2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-badd56",
  "org.scalablytyped" %%% "route-node" % "3.4.2-32bfa1",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-000482",
  "org.scalablytyped" %%% "search-params" % "2.1.3-e917d0",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-31ba1a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        