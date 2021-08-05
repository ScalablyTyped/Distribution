organization := "org.scalablytyped"
name := "sentry__core"
version := "5.27.4-8698a6"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "sentry__hub" % "5.27.4-f63a50",
  "org.scalablytyped" %%% "sentry__types" % "5.27.4-1268b0",
  "org.scalablytyped" %%% "sentry__utils" % "5.27.4-1f682c",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
