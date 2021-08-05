organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20200515Z-cbbb7f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200515Z-352dc4",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20200515Z-ac95cf",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20200515Z-7f628d",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
