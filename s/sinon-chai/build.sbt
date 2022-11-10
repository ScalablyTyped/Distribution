organization := "org.scalablytyped"
name := "sinon-chai"
version := "3.2.0-dt-20221107Z-9e5e3b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chai" % "4.3-dt-20221107Z-365e33",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-663467",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-553558",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
