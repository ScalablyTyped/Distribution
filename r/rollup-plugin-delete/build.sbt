organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "2.0.0-f8e4ae"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "del" % "7.0.0-584be0",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-57d988",
  "org.scalablytyped" %%% "globby" % "13.1.4-98669b",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-061a78",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-b05c2d",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-ee433a",
  "org.scalablytyped" %%% "rollup" % "3.21.6-dbf5a5",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
