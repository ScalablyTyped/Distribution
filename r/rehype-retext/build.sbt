organization := "org.scalablytyped"
name := "rehype-retext"
version := "3.0.2-b2822e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-66e306",
  "org.scalablytyped" %%% "hast-util-to-nlcst" % "2.2.0-18efde",
  "org.scalablytyped" %%% "nlcst" % "1.0-dt-20220624Z-663cf3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "unified" % "10.1.2-8d062e",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-ecc657",
  "org.scalablytyped" %%% "vfile" % "5.3.5-e10c4f",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-369ede")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
