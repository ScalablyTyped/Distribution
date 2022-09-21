organization := "org.scalablytyped"
name := "router5"
version := "8.0.1-f87499"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "path-parser" % "6.1.0-c27809",
  "org.scalablytyped" %%% "route-node" % "4.1.1-16445a",
  "org.scalablytyped" %%% "router5-transition-path" % "8.0.1-8f9d57",
  "org.scalablytyped" %%% "search-params" % "4.0.1-6f5904",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
