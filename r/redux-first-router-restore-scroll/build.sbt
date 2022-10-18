organization := "org.scalablytyped"
name := "redux-first-router-restore-scroll"
version := "1.2-dt-20220118Z-e9f703"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "history" % "5.3.0-4e365b",
  "org.scalablytyped" %%% "redux" % "4.2.0-b8cc4f",
  "org.scalablytyped" %%% "redux-first-router" % "2.1-dt-20220118Z-aaaf26",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
