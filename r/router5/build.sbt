organization := "org.scalablytyped"
name := "router5"
version := "7.0.1-a377bc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-336b3a",
  "org.scalablytyped" %%% "route-node" % "3.4.2-2eaa52",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.0-de780b",
  "org.scalablytyped" %%% "search-params" % "2.1.3-9a2a91",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-0b86c7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        