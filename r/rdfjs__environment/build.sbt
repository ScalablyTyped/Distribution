organization := "org.scalablytyped"
name := "rdfjs__environment"
version := "0.1-dt-20230328Z-937c87"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "rdfjs__namespace" % "2.0-dt-20230328Z-a53128",
  "org.scalablytyped" %%% "rdfjs__sink-map" % "2.0-dt-20230323Z-272caf",
  "org.scalablytyped" %%% "rdfjs__term-map" % "2.0-dt-20230328Z-64ca05",
  "org.scalablytyped" %%% "rdfjs__term-set" % "2.0-dt-20230328Z-07fcfb",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-5a0dcd",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
