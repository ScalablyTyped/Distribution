organization := "org.scalablytyped"
name := "rdf-dataset-ext"
version := "1.0-dt-20220216Z-116b27"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-914e1b",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20220717Z-0586a2",
  "org.scalablytyped" %%% "safe-buffer" % "5.2.1-70da70",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
