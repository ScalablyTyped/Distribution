organization := "org.scalablytyped"
name := "rdf-dataset-ext"
version := "1.0-dt-20220216Z-d4c069"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-a4b9c7",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20220717Z-8fd5fa",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-a12e40",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
