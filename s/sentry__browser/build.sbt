organization := "org.scalablytyped"
name := "sentry__browser"
version := "7.13.0-f1b928"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "sentry__core" % "7.13.0-f8eedb",
  "org.scalablytyped" %%% "sentry__hub" % "7.13.0-a10e6f",
  "org.scalablytyped" %%% "sentry__types" % "7.13.0-7bbad8",
  "org.scalablytyped" %%% "sentry__utils" % "7.13.0-9c5765",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
