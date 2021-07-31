organization := "org.scalablytyped"
name := "redux-first-router-restore-scroll"
version := "1.2-dt-20190730Z-fd521e"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20201002Z-9e47d2",
  "org.scalablytyped" %%% "redux" % "4.0.5-119b89",
  "org.scalablytyped" %%% "redux-first-router" % "2.1-dt-20200515Z-463858",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
