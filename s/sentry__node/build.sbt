organization := "org.scalablytyped"
name := "sentry__node"
version := "7.13.0-2b6b39"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "sentry__core" % "7.15.0-a33aa2",
  "org.scalablytyped" %%% "sentry__hub" % "7.14.0-244802",
  "org.scalablytyped" %%% "sentry__types" % "7.15.0-a15e8d",
  "org.scalablytyped" %%% "sentry__utils" % "7.15.0-a75b84",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
