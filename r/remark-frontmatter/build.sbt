organization := "org.scalablytyped"
name := "remark-frontmatter"
version := "4.0.1-3de3b0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-369e05",
  "org.scalablytyped" %%% "micromark-extension-frontmatter" % "1.0.0-4cb6db",
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
