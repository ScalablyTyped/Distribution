organization := "org.scalablytyped"
name := "quadstore"
version := "12.0.1-7fd261"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-level" % "1.0.3-975e1e",
  "org.scalablytyped" %%% "asynciterator" % "3.8.0-9e44ab",
  "org.scalablytyped" %%% "level-supports" % "4.0.1-8f9f42",
  "org.scalablytyped" %%% "level-transcoder" % "1.0.1-f2ce5f",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-3b406b",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
