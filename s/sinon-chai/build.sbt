organization := "org.scalablytyped"
name := "sinon-chai"
version := "3.2.0-dt-20201002Z-6428b8"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chai" % "4.2-dt-20201016Z-94d43d",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-cf6d2f",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-bf59dd",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
