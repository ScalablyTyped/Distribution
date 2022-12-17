organization := "org.scalablytyped"
name := "remark-mdx"
version := "2.1.5-7f3311"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "acorn" % "8.8.1-b17c2d",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1eb2b4",
  "org.scalablytyped" %%% "estree-util-visit" % "1.2.0-7d1a7f",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-c68da6",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-bd49a6",
  "org.scalablytyped" %%% "mdast-util-mdx" % "2.0.0-2f693a",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.0-6893f2",
  "org.scalablytyped" %%% "mdast-util-mdx-jsx" % "2.1.0-2095a3",
  "org.scalablytyped" %%% "mdast-util-mdxjs-esm" % "1.3.0-ba14c9",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-ef9fe5",
  "org.scalablytyped" %%% "micromark-extension-mdx-expression" % "1.0.3-166b75",
  "org.scalablytyped" %%% "micromark-extension-mdxjs" % "1.0.0-fcb883",
  "org.scalablytyped" %%% "micromark-util-events-to-acorn" % "1.2.0-babdcc",
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
