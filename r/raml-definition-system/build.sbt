organization := "org.scalablytyped"
name := "raml-definition-system"
version := "0.0.94-ab4488"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "raml-json-validation" % "0.0.18-b7fba5",
  "org.scalablytyped" %%% "raml-typesystem" % "0.0.96-71dcfe",
  "org.scalablytyped" %%% "raml-xml-validation" % "0.1.0-7332f8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "ts-structure-model" % "0.0.1-322a39")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
