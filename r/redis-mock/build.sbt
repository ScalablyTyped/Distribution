organization := "org.scalablytyped"
name := "redis-mock"
version := "0.17-dt-20211209Z-c392a1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-1128e5",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "redis" % "4.3.1-39f3b6",
  "org.scalablytyped" %%% "redis__client" % "1.3.0-e4e3c5",
  "org.scalablytyped" %%% "redis__search" % "1.1.0-e87eb1",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.3-24c71a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
