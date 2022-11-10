organization := "org.scalablytyped"
name := "snyk"
version := "1.1008.0-5df02b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "5.1.2-e08eec",
  "org.scalablytyped" %%% "cli-spinners" % "2.7.0-eeb0a2",
  "org.scalablytyped" %%% "needle" % "2.5-dt-20220201Z-5d4a11",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "ora" % "6.1.2-f167fe",
  "org.scalablytyped" %%% "sarif" % "2.1-dt-20211202Z-881660",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
