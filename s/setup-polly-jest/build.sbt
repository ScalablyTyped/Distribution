organization := "org.scalablytyped"
name := "setup-polly-jest"
version := "0.5-dt-20211202Z-dde3b0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "pollyjs__adapter" % "4.3-dt-20211202Z-66e08d",
  "org.scalablytyped" %%% "pollyjs__core" % "4.3-dt-20211202Z-e946f2",
  "org.scalablytyped" %%% "pollyjs__persister" % "4.3-dt-20211202Z-36c112",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
