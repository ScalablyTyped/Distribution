organization := "org.scalablytyped"
name := "router5"
version := "7.0.1-e5f497"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-b4fdd3",
  "org.scalablytyped" %%% "route-node" % "3.4.2-0a5c97",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.0-165ed6",
  "org.scalablytyped" %%% "search-params" % "2.1.3-b81ef9",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-dc48cb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        