organization := "org.scalablytyped"
name := "quadstore"
version := "11.0.6-10c055"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-level" % "1.0.3-014a49",
  "org.scalablytyped" %%% "asynciterator" % "3.7.1-7423b7",
  "org.scalablytyped" %%% "level-supports" % "4.0.1-17e782",
  "org.scalablytyped" %%% "level-transcoder" % "1.0.1-50319b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-496fa3",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
