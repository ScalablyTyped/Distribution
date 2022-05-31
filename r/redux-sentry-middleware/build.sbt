organization := "org.scalablytyped"
name := "redux-sentry-middleware"
version := "0.1-dt-20200914Z-5c4e83"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "redux" % "4.0.5-213600",
  "org.scalablytyped" %%% "sentry__browser" % "5.27.4-ba6f4b",
  "org.scalablytyped" %%% "sentry__core" % "5.27.4-9b561f",
  "org.scalablytyped" %%% "sentry__hub" % "5.27.4-373d06",
  "org.scalablytyped" %%% "sentry__types" % "5.27.4-427e9a",
  "org.scalablytyped" %%% "sentry__utils" % "5.27.4-8ebd60",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
