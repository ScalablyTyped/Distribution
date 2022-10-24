organization := "org.scalablytyped"
name := "sentry__node"
version := "7.15.0-5c6e34"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "sentry__core" % "7.16.0-1d88ba",
  "org.scalablytyped" %%% "sentry__types" % "7.16.0-230952",
  "org.scalablytyped" %%% "sentry__utils" % "7.16.0-703750",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
