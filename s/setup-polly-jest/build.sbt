organization := "org.scalablytyped"
name := "setup-polly-jest"
version := "0.5-dt-20221026Z-6c3fad"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.0-8a2d46",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "pollyjs__core" % "6.0.5-78bc67",
  "org.scalablytyped" %%% "pollyjs__persister" % "6.0.5-a92985",
  "org.scalablytyped" %%% "set-cookie-parser" % "2.4-dt-20211223Z-f98b23",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
