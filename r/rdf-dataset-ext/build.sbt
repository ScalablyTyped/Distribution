organization := "org.scalablytyped"
name := "rdf-dataset-ext"
version := "1.0-dt-20220216Z-51d9bd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-171651",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20221031Z-aeda03",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-250b5a",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
