organization := "org.scalablytyped"
name := "raml-definition-system"
version := "0.0.94-58e40d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "raml-json-validation" % "0.0.18-5dd2b8",
  "org.scalablytyped" %%% "raml-typesystem" % "0.0.96-0bcb91",
  "org.scalablytyped" %%% "raml-xml-validation" % "0.1.0-1a6722",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "ts-structure-model" % "0.0.1-bb53e6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
