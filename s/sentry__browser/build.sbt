organization := "org.scalablytyped"
name := "sentry__browser"
version := "7.18.0-e95587"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "sentry__core" % "7.18.0-426d0e",
  "org.scalablytyped" %%% "sentry__types" % "7.18.0-22e902",
  "org.scalablytyped" %%% "sentry__utils" % "7.18.0-de690f",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
