organization := "org.scalablytyped"
name := "remark-mdx"
version := "2.1.3-c1446e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "acorn" % "8.8.0-88d15e",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9389e9",
  "org.scalablytyped" %%% "estree-util-visit" % "1.2.0-5a1348",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-e12bb0",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-30618b",
  "org.scalablytyped" %%% "mdast-util-mdx" % "2.0.0-a63ea5",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.0-1327cd",
  "org.scalablytyped" %%% "mdast-util-mdx-jsx" % "2.1.0-561a48",
  "org.scalablytyped" %%% "mdast-util-mdxjs-esm" % "1.3.0-dca91c",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-b4e699",
  "org.scalablytyped" %%% "micromark-extension-mdx-expression" % "1.0.3-28dd70",
  "org.scalablytyped" %%% "micromark-extension-mdxjs" % "1.0.0-4e52af",
  "org.scalablytyped" %%% "micromark-util-events-to-acorn" % "1.2.0-916ef9",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-5edda3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "unified" % "10.1.2-7e2642",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-e61dba",
  "org.scalablytyped" %%% "vfile" % "5.3.5-987163",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-6108f4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
