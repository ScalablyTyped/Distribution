organization := "org.scalablytyped"
name := "sentry__node"
version := "7.15.0-3a77a7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "sentry__core" % "7.51.2-2ccab8",
  "org.scalablytyped" %%% "sentry__types" % "7.51.2-024e9f",
  "org.scalablytyped" %%% "sentry__utils" % "7.51.2-7166d2",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
