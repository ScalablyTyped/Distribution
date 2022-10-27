organization := "org.scalablytyped"
name := "rehype-parse"
version := "8.0.4-9cddfc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-66e306",
  "org.scalablytyped" %%% "hast-util-from-parse5" % "7.1.0-5d434a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "property-information" % "6.1.1-b23897",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "unified" % "10.1.2-7914ae",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-ecc657",
  "org.scalablytyped" %%% "vfile" % "5.3.5-41ce54",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-369ede")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
