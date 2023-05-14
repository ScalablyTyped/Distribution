organization := "org.scalablytyped"
name := "rdfjs__environment"
version := "0.1-dt-20230328Z-2a5803"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "rdfjs__namespace" % "2.0-dt-20230328Z-d243a5",
  "org.scalablytyped" %%% "rdfjs__sink-map" % "2.0-dt-20230323Z-df676c",
  "org.scalablytyped" %%% "rdfjs__term-map" % "2.0-dt-20230328Z-9fcbff",
  "org.scalablytyped" %%% "rdfjs__term-set" % "2.0-dt-20230328Z-e4fa9f",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-3b406b",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
