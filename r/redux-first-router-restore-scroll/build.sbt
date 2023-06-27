organization := "org.scalablytyped"
name := "redux-first-router-restore-scroll"
version := "1.2-dt-20220118Z-aba003"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "history" % "5.3.0-ca113c",
  "org.scalablytyped" %%% "redux" % "4.2.1-a751f8",
  "org.scalablytyped" %%% "redux-first-router" % "2.1-dt-20221230Z-c5c05c",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
