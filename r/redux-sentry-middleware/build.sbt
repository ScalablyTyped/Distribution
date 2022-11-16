organization := "org.scalablytyped"
name := "redux-sentry-middleware"
version := "0.2-dt-20211202Z-a02343"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "redux" % "4.2.0-0479e7",
  "org.scalablytyped" %%% "sentry__browser" % "7.19.0-7f9c61",
  "org.scalablytyped" %%% "sentry__core" % "7.19.0-f492d6",
  "org.scalablytyped" %%% "sentry__types" % "7.19.0-b594a5",
  "org.scalablytyped" %%% "sentry__utils" % "7.19.0-daef39",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
