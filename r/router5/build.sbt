organization := "org.scalablytyped"
name := "router5"
version := "8.0.1-db8f01"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "path-parser" % "6.1.0-2996a7",
  "org.scalablytyped" %%% "route-node" % "4.1.1-ea9629",
  "org.scalablytyped" %%% "router5-transition-path" % "8.0.1-1cfeb4",
  "org.scalablytyped" %%% "search-params" % "3.0.0-799cf9",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
