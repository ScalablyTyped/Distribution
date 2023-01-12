organization := "org.scalablytyped"
name := "redis"
version := "4.5.0-b4a178"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-963325",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "redis__client" % "1.4.0-764645",
  "org.scalablytyped" %%% "redis__graph" % "1.1.0-57e483",
  "org.scalablytyped" %%% "redis__search" % "1.1.0-a4646e",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.4-1c6ef9",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
