organization := "org.scalablytyped"
name := "sentry__browser"
version := "7.14.0-b57f0e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "sentry__core" % "7.14.0-d942f5",
  "org.scalablytyped" %%% "sentry__hub" % "7.14.0-8e919b",
  "org.scalablytyped" %%% "sentry__types" % "7.14.0-faa964",
  "org.scalablytyped" %%% "sentry__utils" % "7.14.0-99ac35",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
