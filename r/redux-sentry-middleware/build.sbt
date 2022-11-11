organization := "org.scalablytyped"
name := "redux-sentry-middleware"
version := "0.2-dt-20211202Z-bc2574"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "redux" % "4.2.0-ff8bb6",
  "org.scalablytyped" %%% "sentry__browser" % "7.19.0-dbfd9a",
  "org.scalablytyped" %%% "sentry__core" % "7.19.0-a40fdf",
  "org.scalablytyped" %%% "sentry__types" % "7.19.0-d206e2",
  "org.scalablytyped" %%% "sentry__utils" % "7.19.0-e8941e",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
