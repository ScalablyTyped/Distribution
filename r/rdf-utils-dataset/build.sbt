organization := "org.scalablytyped"
name := "rdf-utils-dataset"
version := "2.0-dt-20230314Z-aa578d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20230328Z-0c80cb",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "rdf-ext" % "2.2-dt-20230420Z-e63d5d",
  "org.scalablytyped" %%% "rdfjs__data-model" % "2.0-dt-20230323Z-3f3303",
  "org.scalablytyped" %%% "rdfjs__dataset" % "2.0-dt-20230328Z-9aff41",
  "org.scalablytyped" %%% "rdfjs__environment" % "0.1-dt-20230328Z-2a5803",
  "org.scalablytyped" %%% "rdfjs__fetch-lite" % "3.0-dt-20230328Z-799aa6",
  "org.scalablytyped" %%% "rdfjs__namespace" % "2.0-dt-20230328Z-d243a5",
  "org.scalablytyped" %%% "rdfjs__prefix-map" % "0.1-dt-20230328Z-c8c881",
  "org.scalablytyped" %%% "rdfjs__score" % "0.1-dt-20230328Z-a06d93",
  "org.scalablytyped" %%% "rdfjs__sink-map" % "2.0-dt-20230323Z-df676c",
  "org.scalablytyped" %%% "rdfjs__term-map" % "2.0-dt-20230328Z-9fcbff",
  "org.scalablytyped" %%% "rdfjs__term-set" % "2.0-dt-20230328Z-e4fa9f",
  "org.scalablytyped" %%% "rdfjs__traverser" % "0.1-dt-20230328Z-9ff656",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-3b406b",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
