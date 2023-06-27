organization := "org.scalablytyped"
name := "sentry__browser"
version := "7.56.0-38b309"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "sentry-internal__tracing" % "7.56.0-17f7b3",
  "org.scalablytyped" %%% "sentry__core" % "7.56.0-993fa1",
  "org.scalablytyped" %%% "sentry__replay" % "7.56.0-b59cd1",
  "org.scalablytyped" %%% "sentry__types" % "7.56.0-37f058",
  "org.scalablytyped" %%% "sentry__utils" % "7.56.0-dbbe66",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
