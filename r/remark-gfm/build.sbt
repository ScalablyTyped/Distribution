organization := "org.scalablytyped"
name := "remark-gfm"
version := "3.0.1-86947b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "markdown-table" % "3.0.2-38a3a3",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-c68da6",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-bd49a6",
  "org.scalablytyped" %%% "mdast-util-gfm-table" % "1.0.6-de9fd9",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-ef9fe5",
  "org.scalablytyped" %%% "micromark-extension-gfm-strikethrough" % "1.0.4-9e187e",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-8f97fd",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "unified" % "10.1.2-f95e2a",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-bd4a10",
  "org.scalablytyped" %%% "vfile" % "5.3.5-c74e3a",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-d40e70")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
