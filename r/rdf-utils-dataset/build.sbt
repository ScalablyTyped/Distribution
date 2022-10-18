organization := "org.scalablytyped"
name := "rdf-utils-dataset"
version := "1.1-dt-20211202Z-5157de"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "rdf-dataset-indexed" % "0.4-dt-20211202Z-d88ea2",
  "org.scalablytyped" %%% "rdf-ext" % "1.3-dt-20211202Z-3753ae",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-82a29b",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
