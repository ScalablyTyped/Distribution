organization := "org.scalablytyped"
name := "redis-mock"
version := "0.17-dt-20211209Z-5701c9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-6648ae",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "redis" % "4.3.1-d6bb2d",
  "org.scalablytyped" %%% "redis__client" % "1.3.0-ed6c0b",
  "org.scalablytyped" %%% "redis__search" % "1.1.0-64244b",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.3-a714ef",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
