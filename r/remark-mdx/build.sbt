organization := "org.scalablytyped"
name := "remark-mdx"
version := "2.1.5-ba6886"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "acorn" % "8.8.1-9a457c",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6dfb17",
  "org.scalablytyped" %%% "estree-util-visit" % "1.2.0-2f3383",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-21ee44",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-2d0877",
  "org.scalablytyped" %%% "mdast-util-mdx" % "2.0.0-93d7a1",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.0-2f08b4",
  "org.scalablytyped" %%% "mdast-util-mdx-jsx" % "2.1.0-7f27d8",
  "org.scalablytyped" %%% "mdast-util-mdxjs-esm" % "1.3.0-78139e",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-87df65",
  "org.scalablytyped" %%% "micromark-extension-mdx-expression" % "1.0.3-712fd3",
  "org.scalablytyped" %%% "micromark-extension-mdxjs" % "1.0.0-9ed1de",
  "org.scalablytyped" %%% "micromark-util-events-to-acorn" % "1.2.0-17d4d9",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-653228",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "unified" % "10.1.2-f65d7d",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-70245a",
  "org.scalablytyped" %%% "vfile" % "5.3.5-33567a",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-c4115f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
