organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20220913Z-c12d05"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20221115Z-c3751e",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20221103Z-6154c2",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20221103Z-1b34d7",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20220923Z-b80908",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-4a08fb",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-abe3d7",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
