organization := "org.scalablytyped"
name := "rehype-parse"
version := "8.0.4-0300c9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-015615",
  "org.scalablytyped" %%% "hast-util-from-parse5" % "7.1.0-0be6b8",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "property-information" % "6.2.0-25446b",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "unified" % "10.1.2-1ef316",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20221230Z-5d1d9b",
  "org.scalablytyped" %%% "vfile" % "5.3.7-78a4c9",
  "org.scalablytyped" %%% "vfile-message" % "3.1.4-a1be56")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
