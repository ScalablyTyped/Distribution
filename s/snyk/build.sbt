organization := "org.scalablytyped"
name := "snyk"
version := "1.1008.0-abc722"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "5.1.2-e9f967",
  "org.scalablytyped" %%% "cli-spinners" % "2.7.0-1bf7b7",
  "org.scalablytyped" %%% "needle" % "2.5-dt-20220201Z-482e8f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "ora" % "6.1.2-0349bd",
  "org.scalablytyped" %%% "sarif" % "2.1-dt-20211202Z-8beb31",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
