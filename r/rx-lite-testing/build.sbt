organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20211202Z-0a3314"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-a1cc09",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-5bfac6",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20220818Z-46c5f8",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
