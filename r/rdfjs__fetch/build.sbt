organization := "org.scalablytyped"
name := "rdfjs__fetch"
version := "3.0-dt-20211202Z-e920f8"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "rdfjs__fetch-lite" % "3.0-dt-20211202Z-38fd0e",
  "org.scalablytyped" %%% "rdfjs__sink-map" % "1.0-dt-20211202Z-47264a",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-8f6934",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
