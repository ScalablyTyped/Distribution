organization := "org.scalablytyped"
name := "rdf-dataset-ext"
version := "1.0-dt-20221201Z-48d739"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-5a0dcd",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20221031Z-2dc0e2",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-38d148",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
