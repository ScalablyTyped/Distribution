organization := "org.scalablytyped"
name := "remark"
version := "13.0.0-441c65"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20190907Z-759e3a",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "0.8.1-a4a4f5",
  "org.scalablytyped" %%% "micromark" % "2.10.1-55cd6b",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "remark-stringify" % "8.1.1-8224e2",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "unified" % "8.4.2-5e2c9e",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-97095f",
  "org.scalablytyped" %%% "vfile" % "4.2.0-5c0bd1",
  "org.scalablytyped" %%% "vfile-message" % "2.0.4-454368")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
