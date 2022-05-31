organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-4b1857"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ecol" % "1.1.1-8e9ddb",
  "org.scalablytyped" %%% "samchon" % "2.1.4-babe16",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "sxml" % "1.0.4-6d3041",
  "org.scalablytyped" %%% "url-variables" % "1.0.3-6b1c94")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
