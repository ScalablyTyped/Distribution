organization := "com.scalablytyped"
name := "router5"
version := "6.6.1-7b6588"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "path-parser" % "4.2.0-833fc6",
  "com.scalablytyped" %%% "route-node" % "3.4.2-0b7ba0",
  "com.scalablytyped" %%% "router5-transition-path" % "5.4.0-742cbc",
  "com.scalablytyped" %%% "search-params" % "2.1.3-c468d5",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-e6336c",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        