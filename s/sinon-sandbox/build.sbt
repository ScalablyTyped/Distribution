organization := "org.scalablytyped"
name := "sinon-sandbox"
version := "2.0-dt-20220208Z-047645"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-4a08fb",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-abe3d7",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
