organization := "org.scalablytyped"
name := "selderee__plugin-htmlparser2"
version := "0.9.0-51b6e5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-cd7455",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-e47de3",
  "org.scalablytyped" %%% "selderee" % "0.9.0-4e70ac",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
