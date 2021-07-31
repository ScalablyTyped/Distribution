organization := "org.scalablytyped"
name := "remark-mdx"
version := "2.0.0-next.8-ff7cdf"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "unified" % "8.4.2-118fac",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-e6c3d0",
  "org.scalablytyped" %%% "vfile" % "4.2.0-c92325",
  "org.scalablytyped" %%% "vfile-message" % "2.0.4-8d389d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
