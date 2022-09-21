organization := "org.scalablytyped"
name := "rdf-utils-dataset"
version := "1.1-dt-20211202Z-36754a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "rdf-dataset-indexed" % "0.4-dt-20211202Z-b9c433",
  "org.scalablytyped" %%% "rdf-ext" % "1.3-dt-20211202Z-5e8bf7",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-914e1b",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
