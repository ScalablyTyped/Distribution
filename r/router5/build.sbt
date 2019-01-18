organization := "org.scalablytyped"
name := "router5"
version := "7.0.1-87ca7b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-947f07",
  "org.scalablytyped" %%% "route-node" % "3.4.2-e83f4b",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.0-f9ca12",
  "org.scalablytyped" %%% "search-params" % "2.1.3-6604d3",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bc5916")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        