organization := "org.scalablytyped"
name := "redis-mock"
version := "0.17-dt-20211209Z-59fee2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-740034",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "redis" % "4.3.1-b8dc15",
  "org.scalablytyped" %%% "redis__client" % "1.3.0-3a5886",
  "org.scalablytyped" %%% "redis__search" % "1.1.0-b21b82",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.3-b21c27",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
