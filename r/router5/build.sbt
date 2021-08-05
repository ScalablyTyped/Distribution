organization := "org.scalablytyped"
name := "router5"
version := "8.0.1-4b6986"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "path-parser" % "6.1.0-f74da4",
  "org.scalablytyped" %%% "route-node" % "4.1.1-2233f9",
  "org.scalablytyped" %%% "router5-transition-path" % "8.0.1-ca3b06",
  "org.scalablytyped" %%% "search-params" % "3.0.0-2e10f1",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
