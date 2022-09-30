organization := "org.scalablytyped"
name := "router5"
version := "8.0.1-1e7ce2"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "path-parser" % "6.1.0-0debcb",
  "org.scalablytyped" %%% "route-node" % "4.1.1-e32987",
  "org.scalablytyped" %%% "router5-transition-path" % "8.0.1-3902bf",
  "org.scalablytyped" %%% "search-params" % "4.0.1-973219",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
