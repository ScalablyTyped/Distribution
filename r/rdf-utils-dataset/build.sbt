organization := "org.scalablytyped"
name := "rdf-utils-dataset"
version := "1.1-dt-20211202Z-9413a9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "rdf-dataset-indexed" % "0.4-dt-20211202Z-150eea",
  "org.scalablytyped" %%% "rdf-ext" % "1.3-dt-20211202Z-a158ad",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-d396ff",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
