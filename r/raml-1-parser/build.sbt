organization := "org.scalablytyped"
name := "raml-1-parser"
version := "1.1.67-b07666"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "raml-definition-system" % "0.0.94-419f5e",
  "org.scalablytyped" %%% "raml-json-validation" % "0.0.18-7566ff",
  "org.scalablytyped" %%% "raml-typesystem" % "0.0.96-ee9e19",
  "org.scalablytyped" %%% "raml-xml-validation" % "0.1.0-42dd17",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "ts-structure-model" % "0.0.1-cd8846",
  "org.scalablytyped" %%% "yaml-ast-parser" % "0.0.43-440dd3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
