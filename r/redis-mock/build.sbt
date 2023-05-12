organization := "org.scalablytyped"
name := "redis-mock"
version := "0.17-dt-20211209Z-a0dbc8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-8a7ed5",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "redis" % "4.6.6-7fc0f2",
  "org.scalablytyped" %%% "redis__client" % "1.5.7-cb7314",
  "org.scalablytyped" %%% "redis__graph" % "1.1.0-a67e13",
  "org.scalablytyped" %%% "redis__search" % "1.1.2-be1b94",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.4-6f96fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
