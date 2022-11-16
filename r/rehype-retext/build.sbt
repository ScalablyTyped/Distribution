organization := "org.scalablytyped"
name := "rehype-retext"
version := "3.0.2-71804a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-03b568",
  "org.scalablytyped" %%% "hast-util-to-nlcst" % "2.2.0-dd6b90",
  "org.scalablytyped" %%% "nlcst" % "1.0-dt-20220624Z-7d4e92",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "unified" % "10.1.2-3b2eb5",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-b11504",
  "org.scalablytyped" %%% "vfile" % "5.3.5-07532a",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-16f1d1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
