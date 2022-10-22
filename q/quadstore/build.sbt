organization := "org.scalablytyped"
name := "quadstore"
version := "11.0.6-7229c9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-level" % "1.0.3-2aa19d",
  "org.scalablytyped" %%% "asynciterator" % "3.7.1-7196c5",
  "org.scalablytyped" %%% "level-supports" % "4.0.1-17e782",
  "org.scalablytyped" %%% "level-transcoder" % "1.0.1-ce4265",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-8f6934",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
