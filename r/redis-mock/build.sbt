organization := "org.scalablytyped"
name := "redis-mock"
version := "0.17-dt-20211209Z-3824dc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-8151bf",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "redis" % "4.3.1-e81cf4",
  "org.scalablytyped" %%% "redis__client" % "1.3.0-ba7d4c",
  "org.scalablytyped" %%% "redis__search" % "1.1.0-ebc366",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.3-c6db63",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
