organization := "org.scalablytyped"
name := "router5"
version := "8.0.1-c7ff05"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "path-parser" % "6.1.0-d7fef4",
  "org.scalablytyped" %%% "route-node" % "4.1.1-f36506",
  "org.scalablytyped" %%% "router5-transition-path" % "8.0.1-c82f17",
  "org.scalablytyped" %%% "search-params" % "4.0.1-2963f9",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
