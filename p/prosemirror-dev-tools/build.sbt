organization := "org.scalablytyped"
name := "prosemirror-dev-tools"
version := "3.0-dt-20221026Z-06aa94"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "orderedmap" % "2.1.0-24aa81",
  "org.scalablytyped" %%% "prosemirror-model" % "1.19.0-d0784d",
  "org.scalablytyped" %%% "prosemirror-state" % "1.4.2-eabfa7",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.7.1-ca0ba7",
  "org.scalablytyped" %%% "prosemirror-view" % "1.31.2-bea34f",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
