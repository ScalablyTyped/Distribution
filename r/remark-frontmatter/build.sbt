organization := "org.scalablytyped"
name := "remark-frontmatter"
version := "4.0.1-deaaad"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-995551",
  "org.scalablytyped" %%% "micromark-extension-frontmatter" % "1.0.0-ea0fde",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-b2fa79",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "unified" % "10.1.2-13644a",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-e82c50",
  "org.scalablytyped" %%% "vfile" % "5.3.5-f00b94",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-e61e19")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
