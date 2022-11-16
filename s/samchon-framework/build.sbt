organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-93a2da"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ecol" % "1.1.1-46a877",
  "org.scalablytyped" %%% "samchon" % "2.1.4-25b0c2",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "sxml" % "1.0.4-7bcf5b",
  "org.scalablytyped" %%% "url-variables" % "1.0.3-bed333")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
