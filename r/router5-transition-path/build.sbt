organization := "org.scalablytyped"
name := "router5-transition-path"
version := "5.4.0-19345b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-a3a07c",
  "org.scalablytyped" %%% "route-node" % "3.4.2-33991d",
  "org.scalablytyped" %%% "router5" % "6.6.2-de64d6",
  "org.scalablytyped" %%% "search-params" % "2.1.3-183bbf",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-343133")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        