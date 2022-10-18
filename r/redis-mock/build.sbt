organization := "org.scalablytyped"
name := "redis-mock"
version := "0.17-dt-20211209Z-b2019f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-b653f6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "redis" % "4.3.1-7a3885",
  "org.scalablytyped" %%% "redis__client" % "1.3.0-540aea",
  "org.scalablytyped" %%% "redis__search" % "1.1.0-23e0cf",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.3-f18ee8",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
