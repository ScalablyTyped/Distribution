organization := "org.scalablytyped"
name := "router5"
version := "7.0.1-fb0bc2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-6cc2c9",
  "org.scalablytyped" %%% "route-node" % "3.4.2-c07cf4",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.0-fbe21f",
  "org.scalablytyped" %%% "search-params" % "2.1.3-206ae7",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e21f3d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        