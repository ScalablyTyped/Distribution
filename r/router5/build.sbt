organization := "org.scalablytyped"
name := "router5"
version := "7.0.2-ae3439"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-0b4e51",
  "org.scalablytyped" %%% "route-node" % "3.4.2-00b96f",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.1-1215bf",
  "org.scalablytyped" %%% "search-params" % "2.1.3-98b49b",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        