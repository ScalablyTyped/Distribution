organization := "org.scalablytyped"
name := "setup-polly-jest"
version := "0.5-dt-20200925Z-bc7c52"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "pollyjs__adapter" % "4.3-dt-20200925Z-a4ba5a",
  "org.scalablytyped" %%% "pollyjs__core" % "4.3-dt-20200925Z-8178f6",
  "org.scalablytyped" %%% "pollyjs__persister" % "4.3-dt-20200925Z-9ab58d",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
