organization := "org.scalablytyped"
name := "redis"
version := "4.4.0-5f6f08"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-0d7941",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "redis__client" % "1.3.1-37247e",
  "org.scalablytyped" %%% "redis__graph" % "1.1.0-ecfaa6",
  "org.scalablytyped" %%% "redis__search" % "1.1.0-5e373c",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.3-2a9bc2",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
