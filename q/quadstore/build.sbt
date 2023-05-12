organization := "org.scalablytyped"
name := "quadstore"
version := "12.0.1-e2774d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-level" % "1.0.3-831848",
  "org.scalablytyped" %%% "asynciterator" % "3.8.0-e67393",
  "org.scalablytyped" %%% "level-supports" % "4.0.1-8f9f42",
  "org.scalablytyped" %%% "level-transcoder" % "1.0.1-ef2313",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-5a0dcd",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
