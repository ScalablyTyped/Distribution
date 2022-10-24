organization := "org.scalablytyped"
name := "prosemirror-changeset"
version := "2.1-dt-20220525Z-df1530"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "orderedmap" % "2.0.0-8d46bb",
  "org.scalablytyped" %%% "prosemirror-model" % "1.18.1-285b58",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.7.0-b9bbdf",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
