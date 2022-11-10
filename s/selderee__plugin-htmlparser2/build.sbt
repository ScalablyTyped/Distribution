organization := "org.scalablytyped"
name := "selderee__plugin-htmlparser2"
version := "0.9.0-09888f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-b522a9",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-79fef0",
  "org.scalablytyped" %%% "selderee" % "0.9.0-d00d78",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
