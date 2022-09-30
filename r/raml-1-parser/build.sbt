organization := "org.scalablytyped"
name := "raml-1-parser"
version := "1.1.67-956085"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "raml-definition-system" % "0.0.94-22bdca",
  "org.scalablytyped" %%% "raml-json-validation" % "0.0.18-7c4d76",
  "org.scalablytyped" %%% "raml-typesystem" % "0.0.96-eac5ba",
  "org.scalablytyped" %%% "raml-xml-validation" % "0.1.0-992ba0",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "ts-structure-model" % "0.0.1-3a2739",
  "org.scalablytyped" %%% "yaml-ast-parser" % "0.0.43-8a8517")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
