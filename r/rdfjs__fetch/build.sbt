organization := "org.scalablytyped"
name := "rdfjs__fetch"
version := "2.0-dt-20200925Z-4170a9"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "rdf-js" % "4.0-dt-20201002Z-9dc2fe",
  "org.scalablytyped" %%% "rdfjs__fetch-lite" % "2.0-dt-20200925Z-d8622b",
  "org.scalablytyped" %%% "rdfjs__sink-map" % "1.0-dt-20200925Z-49cb42",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
