organization := "org.scalablytyped"
name := "randoma"
version := "2.0.0-2de36a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "color" % "3.0-dt-20220819Z-1f61ea",
  "org.scalablytyped" %%% "color-convert" % "2.0-dt-20211202Z-7c7c1a",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20211202Z-135be1",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
