organization := "org.scalablytyped"
name := "rdf-utils-dataset"
version := "1.1-dt-20211202Z-fb28c2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "rdf-dataset-indexed" % "0.4-dt-20211202Z-16c26e",
  "org.scalablytyped" %%% "rdf-ext" % "1.3-dt-20211202Z-f0663a",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-171651",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
