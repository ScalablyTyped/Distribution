organization := "org.scalablytyped"
name := "snyk"
version := "1.1008.0-71c294"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "5.1.2-70b91c",
  "org.scalablytyped" %%% "cli-spinners" % "2.7.0-475712",
  "org.scalablytyped" %%% "needle" % "2.5-dt-20220201Z-67b40a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "ora" % "6.1.2-8387a1",
  "org.scalablytyped" %%% "sarif" % "2.1-dt-20211202Z-6bdef8",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
