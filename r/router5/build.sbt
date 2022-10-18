organization := "org.scalablytyped"
name := "router5"
version := "8.0.1-099b90"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "path-parser" % "6.1.0-4d49e7",
  "org.scalablytyped" %%% "route-node" % "4.1.1-e9bf73",
  "org.scalablytyped" %%% "router5-transition-path" % "8.0.1-df6201",
  "org.scalablytyped" %%% "search-params" % "4.0.1-0bd747",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
