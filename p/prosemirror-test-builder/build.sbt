organization := "org.scalablytyped"
name := "prosemirror-test-builder"
version := "1.0-dt-20190312Z-b9d4ed"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20200515Z-4bd551",
  "org.scalablytyped" %%% "prosemirror-model" % "1.11-dt-20201109Z-a1debb",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
