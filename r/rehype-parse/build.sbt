organization := "org.scalablytyped"
name := "rehype-parse"
version := "8.0.4-f17b28"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-9dd461",
  "org.scalablytyped" %%% "hast-util-from-parse5" % "7.1.0-dd575a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "property-information" % "6.1.1-2cd5bb",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "unified" % "10.1.2-f65d7d",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-70245a",
  "org.scalablytyped" %%% "vfile" % "5.3.5-33567a",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-c4115f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
