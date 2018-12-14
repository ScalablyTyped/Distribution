organization := "org.scalablytyped"
name := "router5-transition-path"
version := "5.4.0-40a2b6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-714f8a",
  "org.scalablytyped" %%% "route-node" % "3.4.2-68392f",
  "org.scalablytyped" %%% "router5" % "6.6.2-e33ff6",
  "org.scalablytyped" %%% "search-params" % "2.1.3-1be8bf",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-343133")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        