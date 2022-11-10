organization := "org.scalablytyped"
name := "remark-mdx"
version := "2.1.5-fa3682"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "acorn" % "8.8.1-3fee69",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1ed7c2",
  "org.scalablytyped" %%% "estree-util-visit" % "1.2.0-8aadbc",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-aaf55e",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-9867da",
  "org.scalablytyped" %%% "mdast-util-mdx" % "2.0.0-e8dfbb",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.0-a59dc1",
  "org.scalablytyped" %%% "mdast-util-mdx-jsx" % "2.1.0-34ba41",
  "org.scalablytyped" %%% "mdast-util-mdxjs-esm" % "1.3.0-81ea49",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-6d29ff",
  "org.scalablytyped" %%% "micromark-extension-mdx-expression" % "1.0.3-a15e3a",
  "org.scalablytyped" %%% "micromark-extension-mdxjs" % "1.0.0-da0104",
  "org.scalablytyped" %%% "micromark-util-events-to-acorn" % "1.2.0-f16c69",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-572d0c",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "unified" % "10.1.2-6a23f2",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-cacd8c",
  "org.scalablytyped" %%% "vfile" % "5.3.5-ab363b",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-222455")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
