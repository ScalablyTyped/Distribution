organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.1.3-e6829c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "redux" % "4.0.5-213600",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-e709bd",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-2e24de",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-f080b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
