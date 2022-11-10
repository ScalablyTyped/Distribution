organization := "org.scalablytyped"
name := "setup-polly-jest"
version := "0.5-dt-20221026Z-abdc1c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-34f6e8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "pollyjs__core" % "6.0.5-3e49d0",
  "org.scalablytyped" %%% "pollyjs__persister" % "6.0.5-8deaa1",
  "org.scalablytyped" %%% "set-cookie-parser" % "2.4-dt-20211223Z-8fd511",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
