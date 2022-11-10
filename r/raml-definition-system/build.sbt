organization := "org.scalablytyped"
name := "raml-definition-system"
version := "0.0.94-773910"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "raml-json-validation" % "0.0.18-292a3e",
  "org.scalablytyped" %%% "raml-typesystem" % "0.0.96-6cb05c",
  "org.scalablytyped" %%% "raml-xml-validation" % "0.1.0-3c4a3e",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "ts-structure-model" % "0.0.1-2b55a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
