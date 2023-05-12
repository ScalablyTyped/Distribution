organization := "org.scalablytyped"
name := "raml-definition-system"
version := "0.0.94-419f5e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "raml-json-validation" % "0.0.18-7566ff",
  "org.scalablytyped" %%% "raml-typesystem" % "0.0.96-ee9e19",
  "org.scalablytyped" %%% "raml-xml-validation" % "0.1.0-42dd17",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "ts-structure-model" % "0.0.1-cd8846")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
