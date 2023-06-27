organization := "org.scalablytyped"
name := "rehype-raw"
version := "6.1.1-07464d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-8965ce",
  "org.scalablytyped" %%% "hast-util-raw" % "7.2.2-59110c",
  "org.scalablytyped" %%% "parse5" % "7.1.2-ff5512",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "unified" % "10.1.2-5e1b1d",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20221230Z-9eb15f",
  "org.scalablytyped" %%% "vfile" % "6.0.0-a3c247",
  "org.scalablytyped" %%% "vfile-message" % "4.0.1-85ce0b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
