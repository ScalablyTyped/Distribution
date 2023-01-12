organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "2.0.0-0e87d3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "del" % "7.0.0-7bfe16",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-475d1a",
  "org.scalablytyped" %%% "globby" % "13.1.2-c0eaf5",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-97f62b",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-89b7e7",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-ffff8a",
  "org.scalablytyped" %%% "rollup" % "3.3.0-76f060",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
