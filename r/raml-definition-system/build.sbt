organization := "org.scalablytyped"
name := "raml-definition-system"
version := "0.0.94-c0edce"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "raml-json-validation" % "0.0.18-c95786",
  "org.scalablytyped" %%% "raml-typesystem" % "0.0.96-a579c5",
  "org.scalablytyped" %%% "raml-xml-validation" % "0.1.0-fd2a8e",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "ts-structure-model" % "0.0.1-591971")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
