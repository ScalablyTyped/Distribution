organization := "org.scalablytyped"
name := "redux-first-router-restore-scroll"
version := "1.2-dt-20220118Z-63489c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "history" % "5.3.0-2d78e1",
  "org.scalablytyped" %%% "redux" % "4.2.1-49dd26",
  "org.scalablytyped" %%% "redux-first-router" % "2.1-dt-20221230Z-0c3850",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
