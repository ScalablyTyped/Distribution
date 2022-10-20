organization := "org.scalablytyped"
name := "redis-mock"
version := "0.17-dt-20211209Z-8c5bcf"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-89c67e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "redis" % "4.3.1-8de7e0",
  "org.scalablytyped" %%% "redis__client" % "1.3.0-73ae5e",
  "org.scalablytyped" %%% "redis__search" % "1.1.0-7f4594",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.3-f00eb6",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
