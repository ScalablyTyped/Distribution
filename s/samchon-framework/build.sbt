organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-b36d1e"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ecol" % "1.1.1-3cea24",
  "org.scalablytyped" %%% "samchon" % "2.1.4-e0e1fa",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "sxml" % "1.0.4-0afc38",
  "org.scalablytyped" %%% "url-variables" % "1.0.3-a8476b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
