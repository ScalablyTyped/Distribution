organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "2.0.0-76b9a0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "del" % "7.0.0-9fa5bc",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-fe5fa8",
  "org.scalablytyped" %%% "globby" % "13.1.4-0438a1",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-1760d3",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-0255b0",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-4b0817",
  "org.scalablytyped" %%% "rollup" % "3.21.7-e69163",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
