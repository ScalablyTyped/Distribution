organization := "com.scalablytyped"
name := "router5"
version := "6.6.2-f7c75a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "path-parser" % "4.2.0-8b78aa",
  "com.scalablytyped" %%% "route-node" % "3.4.2-8e17bc",
  "com.scalablytyped" %%% "router5-transition-path" % "5.4.0-41b6df",
  "com.scalablytyped" %%% "search-params" % "2.1.3-15c747",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-998bd5",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        