organization := "org.scalablytyped"
name := "remark-mdx"
version := "2.1.5-e9c9ee"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "acorn" % "8.8.1-c271b3",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9e7169",
  "org.scalablytyped" %%% "estree-util-visit" % "1.2.0-4c5942",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-627ab0",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-f0ca54",
  "org.scalablytyped" %%% "mdast-util-mdx" % "2.0.0-84b8b2",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.0-b6b9d8",
  "org.scalablytyped" %%% "mdast-util-mdx-jsx" % "2.1.0-a9f415",
  "org.scalablytyped" %%% "mdast-util-mdxjs-esm" % "1.3.0-25ea9b",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-baeeb7",
  "org.scalablytyped" %%% "micromark-extension-mdx-expression" % "1.0.3-2e742b",
  "org.scalablytyped" %%% "micromark-extension-mdxjs" % "1.0.0-c317b2",
  "org.scalablytyped" %%% "micromark-util-events-to-acorn" % "1.2.0-e8df4c",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-dfb004",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "unified" % "10.1.2-3b2eb5",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-b11504",
  "org.scalablytyped" %%% "vfile" % "5.3.5-07532a",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-16f1d1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
