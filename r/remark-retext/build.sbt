organization := "org.scalablytyped"
name := "remark-retext"
version := "5.0.1-d31e11"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20230320Z-567783",
  "org.scalablytyped" %%% "mdast-util-to-nlcst" % "5.2.1-36b988",
  "org.scalablytyped" %%% "nlcst" % "1.0-dt-20220624Z-5d4149",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "unified" % "10.1.2-5e1b1d",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20221230Z-9eb15f",
  "org.scalablytyped" %%% "vfile" % "6.0.0-a3c247",
  "org.scalablytyped" %%% "vfile-location" % "5.0.1-a092cd",
  "org.scalablytyped" %%% "vfile-message" % "4.0.1-85ce0b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
