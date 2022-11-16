organization := "org.scalablytyped"
name := "router5"
version := "8.0.1-82abbd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "path-parser" % "6.1.0-96c221",
  "org.scalablytyped" %%% "route-node" % "4.1.1-120233",
  "org.scalablytyped" %%% "router5-transition-path" % "8.0.1-b353df",
  "org.scalablytyped" %%% "search-params" % "4.0.1-dff9c6",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
