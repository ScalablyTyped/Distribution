organization := "org.scalablytyped"
name := "sinon-stub-promise"
version := "v2.1.0-dt-20220818Z-03d8d7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20230514Z-db3041",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-bc3c2e",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
