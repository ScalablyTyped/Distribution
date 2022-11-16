organization := "org.scalablytyped"
name := "quadstore"
version := "11.0.7-206273"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-level" % "1.0.3-71b169",
  "org.scalablytyped" %%% "asynciterator" % "3.8.0-a61b49",
  "org.scalablytyped" %%% "level-supports" % "4.0.1-c734da",
  "org.scalablytyped" %%% "level-transcoder" % "1.0.1-a9f13b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-392890",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
