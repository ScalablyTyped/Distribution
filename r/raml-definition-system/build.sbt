organization := "org.scalablytyped"
name := "raml-definition-system"
version := "0.0.94-317e00"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "raml-json-validation" % "0.0.18-d89818",
  "org.scalablytyped" %%% "raml-typesystem" % "0.0.96-5ad9f4",
  "org.scalablytyped" %%% "raml-xml-validation" % "0.1.0-9d0707",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "ts-structure-model" % "0.0.1-705bf6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
