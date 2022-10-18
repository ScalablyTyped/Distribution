organization := "org.scalablytyped"
name := "redux-sentry-middleware"
version := "0.2-dt-20211202Z-b0c593"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "redux" % "4.2.0-b8cc4f",
  "org.scalablytyped" %%% "sentry__browser" % "7.15.0-07cabf",
  "org.scalablytyped" %%% "sentry__core" % "7.15.0-a33aa2",
  "org.scalablytyped" %%% "sentry__types" % "7.15.0-a15e8d",
  "org.scalablytyped" %%% "sentry__utils" % "7.15.0-a75b84",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
