organization := "org.scalablytyped"
name := "snyk"
version := "1.1008.0-4669d2"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "5.1.2-68fef1",
  "org.scalablytyped" %%% "cli-spinners" % "2.7.0-2c1c27",
  "org.scalablytyped" %%% "needle" % "2.5-dt-20220201Z-653e66",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "ora" % "6.1.2-eefe49",
  "org.scalablytyped" %%% "sarif" % "2.1-dt-20211202Z-345109",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
