organization := "org.scalablytyped"
name := "rdf-utils-dataset"
version := "2.0-dt-20230314Z-31bb5a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20230328Z-ab7f55",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "rdf-ext" % "2.2-dt-20230420Z-781004",
  "org.scalablytyped" %%% "rdfjs__data-model" % "2.0-dt-20230323Z-2b5a57",
  "org.scalablytyped" %%% "rdfjs__dataset" % "2.0-dt-20230328Z-2109ab",
  "org.scalablytyped" %%% "rdfjs__environment" % "0.1-dt-20230328Z-937c87",
  "org.scalablytyped" %%% "rdfjs__fetch-lite" % "3.0-dt-20230328Z-a6c23d",
  "org.scalablytyped" %%% "rdfjs__namespace" % "2.0-dt-20230328Z-a53128",
  "org.scalablytyped" %%% "rdfjs__prefix-map" % "0.1-dt-20230328Z-aac163",
  "org.scalablytyped" %%% "rdfjs__score" % "0.1-dt-20230328Z-93a89a",
  "org.scalablytyped" %%% "rdfjs__sink-map" % "2.0-dt-20230323Z-272caf",
  "org.scalablytyped" %%% "rdfjs__term-map" % "2.0-dt-20230328Z-64ca05",
  "org.scalablytyped" %%% "rdfjs__term-set" % "2.0-dt-20230328Z-07fcfb",
  "org.scalablytyped" %%% "rdfjs__traverser" % "0.1-dt-20230328Z-8e5bfa",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-5a0dcd",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
