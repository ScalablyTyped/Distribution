organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "2.0.0-1c72a1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "del" % "7.0.0-dbd79a",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-2f90b8",
  "org.scalablytyped" %%% "globby" % "13.1.2-a97c12",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-cb64d6",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-dd01a0",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-4f4518",
  "org.scalablytyped" %%% "rollup" % "2.79.1-091416",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
