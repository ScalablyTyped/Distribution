organization := "org.scalablytyped"
name := "redis-mock"
version := "0.17-dt-20211209Z-50af7a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-6d9f5a",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "redis" % "4.3.1-31af9c",
  "org.scalablytyped" %%% "redis__client" % "1.3.0-7d36e0",
  "org.scalablytyped" %%% "redis__search" % "1.1.0-7ea90b",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.3-46cbdd",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
