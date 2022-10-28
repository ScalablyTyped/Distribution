organization := "org.scalablytyped"
name := "sentry__browser"
version := "7.17.1-0e9003"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "sentry__core" % "7.17.1-7246f4",
  "org.scalablytyped" %%% "sentry__types" % "7.17.1-939bd9",
  "org.scalablytyped" %%% "sentry__utils" % "7.17.1-35cfd2",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
