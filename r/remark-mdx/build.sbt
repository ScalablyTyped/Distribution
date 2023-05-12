organization := "org.scalablytyped"
name := "remark-mdx"
version := "2.1.5-8b78d2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "acorn" % "8.8.2-05cc67",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20230419Z-f51b02",
  "org.scalablytyped" %%% "estree-util-visit" % "1.2.0-09d316",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-015615",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20230320Z-8fafb0",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.3.0-50ce5f",
  "org.scalablytyped" %%% "mdast-util-mdx" % "2.0.0-1e1baa",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.2-1c8e08",
  "org.scalablytyped" %%% "mdast-util-mdx-jsx" % "2.1.0-01d39f",
  "org.scalablytyped" %%% "mdast-util-mdxjs-esm" % "1.3.0-6f7341",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.5.0-1f7998",
  "org.scalablytyped" %%% "micromark-extension-mdx-expression" % "1.0.3-805d2f",
  "org.scalablytyped" %%% "micromark-extension-mdxjs" % "1.0.0-31c9c3",
  "org.scalablytyped" %%% "micromark-util-events-to-acorn" % "1.2.0-93014b",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-813843",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "unified" % "10.1.2-f9156b",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20221230Z-5d1d9b",
  "org.scalablytyped" %%% "vfile" % "5.3.7-163732",
  "org.scalablytyped" %%% "vfile-message" % "3.1.4-a1be56")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
