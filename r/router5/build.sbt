organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-bcb60e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-0d4dc7",
  "org.scalablytyped" %%% "route-node" % "3.4.2-08f3b5",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-17f93d",
  "org.scalablytyped" %%% "search-params" % "2.1.3-8ed377",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bfac6c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        