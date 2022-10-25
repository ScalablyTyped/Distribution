organization := "org.scalablytyped"
name := "quadstore"
version := "11.0.6-3e42a0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-level" % "1.0.3-a7c5aa",
  "org.scalablytyped" %%% "asynciterator" % "3.7.1-106862",
  "org.scalablytyped" %%% "level-supports" % "4.0.1-9e714b",
  "org.scalablytyped" %%% "level-transcoder" % "1.0.1-7692bd",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-572810",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
