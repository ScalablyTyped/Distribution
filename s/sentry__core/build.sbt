organization := "org.scalablytyped"
name := "sentry__core"
version := "5.27.4-9b561f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "sentry__hub" % "5.27.4-373d06",
  "org.scalablytyped" %%% "sentry__types" % "5.27.4-427e9a",
  "org.scalablytyped" %%% "sentry__utils" % "5.27.4-8ebd60",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
