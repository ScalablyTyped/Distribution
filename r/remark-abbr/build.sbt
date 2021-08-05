organization := "org.scalablytyped"
name := "remark-abbr"
version := "1.4-dt-20201028Z-9eee09"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "unified" % "8.4.2-27c288",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-61e58c",
  "org.scalablytyped" %%% "vfile" % "4.2.0-8c5350",
  "org.scalablytyped" %%% "vfile-message" % "2.0.4-13580d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
