organization := "org.scalablytyped"
name := "snyk"
version := "1.1008.0-abdfaa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "5.1.2-44f540",
  "org.scalablytyped" %%% "cli-spinners" % "2.7.0-e30137",
  "org.scalablytyped" %%% "needle" % "2.5-dt-20220201Z-43ef5b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "ora" % "6.1.2-d425cd",
  "org.scalablytyped" %%% "sarif" % "2.1-dt-20211202Z-f599b4",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
