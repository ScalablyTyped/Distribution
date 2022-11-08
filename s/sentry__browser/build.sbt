organization := "org.scalablytyped"
name := "sentry__browser"
version := "7.18.0-671d74"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "sentry__core" % "7.18.0-62a464",
  "org.scalablytyped" %%% "sentry__types" % "7.18.0-e20b1f",
  "org.scalablytyped" %%% "sentry__utils" % "7.18.0-67586b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
