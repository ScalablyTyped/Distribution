organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-cf52a7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-c21a66",
  "org.scalablytyped" %%% "route-node" % "3.4.2-95978d",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-2385de",
  "org.scalablytyped" %%% "search-params" % "2.1.3-e58d58",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-a7455c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        