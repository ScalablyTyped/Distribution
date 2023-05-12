organization := "org.scalablytyped"
name := "randoma"
version := "2.0.0-38cb7b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "color" % "3.0-dt-20220819Z-9b6dcb",
  "org.scalablytyped" %%% "color-convert" % "2.0-dt-20230328Z-7bdcd7",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20211202Z-d769f2",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
