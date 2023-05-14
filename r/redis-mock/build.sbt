organization := "org.scalablytyped"
name := "redis-mock"
version := "0.17-dt-20211209Z-24b921"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-62ade9",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "redis" % "4.6.6-cda3e3",
  "org.scalablytyped" %%% "redis__client" % "1.5.7-761cf5",
  "org.scalablytyped" %%% "redis__graph" % "1.1.0-9134ab",
  "org.scalablytyped" %%% "redis__search" % "1.1.2-34cac6",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.4-635afe",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
