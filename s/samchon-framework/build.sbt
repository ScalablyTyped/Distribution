organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-d85fb1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ecol" % "1.1.1-04a488",
  "org.scalablytyped" %%% "samchon" % "2.1.4-1f4bea",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "sxml" % "1.0.4-3aee28",
  "org.scalablytyped" %%% "url-variables" % "1.0.3-68e9eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
