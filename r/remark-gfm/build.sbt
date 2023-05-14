organization := "org.scalablytyped"
name := "remark-gfm"
version := "3.0.1-8cc313"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "markdown-table" % "3.0.3-a79fe8",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20230320Z-8fafb0",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.3.0-50ce5f",
  "org.scalablytyped" %%% "mdast-util-gfm-table" % "1.0.6-d557c3",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.5.0-1f7998",
  "org.scalablytyped" %%% "micromark-extension-gfm-strikethrough" % "1.0.4-b7789d",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-813843",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "unified" % "10.1.2-1ef316",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20221230Z-5d1d9b",
  "org.scalablytyped" %%% "vfile" % "5.3.7-78a4c9",
  "org.scalablytyped" %%% "vfile-message" % "3.1.4-a1be56")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
