organization := "org.scalablytyped"
name := "setup-polly-jest"
version := "0.5-dt-20221026Z-fe8fa7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-34f6e8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "pollyjs__core" % "6.0.5-70b7e0",
  "org.scalablytyped" %%% "pollyjs__persister" % "6.0.5-d7fa1f",
  "org.scalablytyped" %%% "set-cookie-parser" % "2.4-dt-20211223Z-1295a3",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
