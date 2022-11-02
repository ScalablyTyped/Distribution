organization := "org.scalablytyped"
name := "remark-gfm"
version := "3.0.1-4ffb65"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "markdown-table" % "3.0.2-c37ca8",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-369e05",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-e8c943",
  "org.scalablytyped" %%% "mdast-util-gfm-table" % "1.0.6-46e99c",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-fa3b83",
  "org.scalablytyped" %%% "micromark-extension-gfm-strikethrough" % "1.0.4-c13264",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-bd4ab8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "unified" % "10.1.2-cb913f",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-ecc657",
  "org.scalablytyped" %%% "vfile" % "5.3.5-741312",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-369ede")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
