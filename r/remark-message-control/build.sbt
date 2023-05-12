organization := "org.scalablytyped"
name := "remark-message-control"
version := "7.1.1-fe9e8a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20230320Z-8fafb0",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "unified-message-control" % "4.0.0-aae47b",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20221230Z-5d1d9b",
  "org.scalablytyped" %%% "unist-util-is" % "5.2.1-049c4b",
  "org.scalablytyped" %%% "vfile" % "5.3.7-163732",
  "org.scalablytyped" %%% "vfile-message" % "3.1.4-a1be56")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
