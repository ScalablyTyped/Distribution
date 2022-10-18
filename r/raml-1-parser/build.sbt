organization := "org.scalablytyped"
name := "raml-1-parser"
version := "1.1.67-13a249"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "raml-definition-system" % "0.0.94-c2d7a7",
  "org.scalablytyped" %%% "raml-json-validation" % "0.0.18-9e5c7f",
  "org.scalablytyped" %%% "raml-typesystem" % "0.0.96-b86fc1",
  "org.scalablytyped" %%% "raml-xml-validation" % "0.1.0-ffb358",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "ts-structure-model" % "0.0.1-1f6374",
  "org.scalablytyped" %%% "yaml-ast-parser" % "0.0.43-754b17")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
