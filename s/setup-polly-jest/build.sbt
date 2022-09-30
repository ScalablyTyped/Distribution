organization := "org.scalablytyped"
name := "setup-polly-jest"
version := "0.5-dt-20211202Z-a0e188"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "pollyjs__adapter" % "4.3-dt-20211202Z-7117ae",
  "org.scalablytyped" %%% "pollyjs__core" % "4.3-dt-20211202Z-b71ecf",
  "org.scalablytyped" %%% "pollyjs__persister" % "4.3-dt-20211202Z-b394e4",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
