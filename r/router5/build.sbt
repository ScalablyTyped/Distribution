organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-9169af"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-04773d",
  "org.scalablytyped" %%% "route-node" % "3.4.2-82e08f",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-83637f",
  "org.scalablytyped" %%% "search-params" % "2.1.3-b4babb",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1f290b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        