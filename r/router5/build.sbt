organization := "org.scalablytyped"
name := "router5"
version := "8.0.1-0651ef"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "path-parser" % "6.1.0-5116e1",
  "org.scalablytyped" %%% "route-node" % "4.1.1-3b8b2c",
  "org.scalablytyped" %%% "router5-transition-path" % "8.0.1-f8bc60",
  "org.scalablytyped" %%% "search-params" % "4.0.1-a9f706",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
