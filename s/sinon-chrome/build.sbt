organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20201002Z-ddf8bd"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20201028Z-b33e14",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20201002Z-fc929d",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20201002Z-72f439",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20201030Z-fedcca",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-cf6d2f",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-bf59dd",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
