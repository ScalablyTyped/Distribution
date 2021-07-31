organization := "org.scalablytyped"
name := "router5"
version := "8.0.1-a6033c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "path-parser" % "6.1.0-c654d1",
  "org.scalablytyped" %%% "route-node" % "4.1.1-675c83",
  "org.scalablytyped" %%% "router5-transition-path" % "8.0.1-7bbc23",
  "org.scalablytyped" %%% "search-params" % "3.0.0-f03cba",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
