organization := "org.scalablytyped"
name := "sentry__browser"
version := "7.17.4-b6052b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "sentry__core" % "7.17.4-e9de81",
  "org.scalablytyped" %%% "sentry__types" % "7.17.4-3bb396",
  "org.scalablytyped" %%% "sentry__utils" % "7.17.4-12a47c",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
