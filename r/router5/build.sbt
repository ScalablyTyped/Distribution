organization := "org.scalablytyped"
name := "router5"
version := "8.0.1-be90e0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "path-parser" % "6.1.0-29740a",
  "org.scalablytyped" %%% "route-node" % "4.1.1-88627d",
  "org.scalablytyped" %%% "router5-transition-path" % "8.0.1-6ea0f0",
  "org.scalablytyped" %%% "search-params" % "4.0.1-216b1b",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
