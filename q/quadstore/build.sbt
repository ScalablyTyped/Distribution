organization := "org.scalablytyped"
name := "quadstore"
version := "11.0.3-2ad780"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-level" % "1.0.3-7b5a82",
  "org.scalablytyped" %%% "asynciterator" % "3.7.1-98e11a",
  "org.scalablytyped" %%% "level-supports" % "4.0.1-9c3af8",
  "org.scalablytyped" %%% "level-transcoder" % "1.0.1-bc7f99",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-914e1b",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
