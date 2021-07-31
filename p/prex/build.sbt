organization := "org.scalablytyped"
name := "prex"
version := "0.4.7-2abeea"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.13-bc9235",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.13-0fe266",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
