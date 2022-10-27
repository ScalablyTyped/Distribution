organization := "org.scalablytyped"
name := "remark-mdx"
version := "2.1.3-bd47d0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "acorn" % "8.8.1-bfd3ad",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "estree-util-visit" % "1.2.0-45d89b",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-369e05",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-e8c943",
  "org.scalablytyped" %%% "mdast-util-mdx" % "2.0.0-7eb181",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.0-89385e",
  "org.scalablytyped" %%% "mdast-util-mdx-jsx" % "2.1.0-f3b349",
  "org.scalablytyped" %%% "mdast-util-mdxjs-esm" % "1.3.0-6469ad",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-fa3b83",
  "org.scalablytyped" %%% "micromark-extension-mdx-expression" % "1.0.3-d179ec",
  "org.scalablytyped" %%% "micromark-extension-mdxjs" % "1.0.0-62047c",
  "org.scalablytyped" %%% "micromark-util-events-to-acorn" % "1.2.0-80c506",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-bd4ab8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "unified" % "10.1.2-7914ae",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-ecc657",
  "org.scalablytyped" %%% "vfile" % "5.3.5-41ce54",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-369ede")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
