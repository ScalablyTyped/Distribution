organization := "org.scalablytyped"
name := "remark"
version := "13.0.0-8c3a73"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20190907Z-5a7184",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "0.8.1-646904",
  "org.scalablytyped" %%% "micromark" % "2.10.1-cc4819",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "remark-stringify" % "8.1.1-6218d3",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "unified" % "8.4.2-27c288",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-61e58c",
  "org.scalablytyped" %%% "vfile" % "4.2.0-8c5350",
  "org.scalablytyped" %%% "vfile-message" % "2.0.4-13580d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
