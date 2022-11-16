organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "2.0.0-94e882"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "del" % "7.0.0-88730c",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-9b0035",
  "org.scalablytyped" %%% "globby" % "13.1.2-b01dfe",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-33e016",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-b29f24",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-67654b",
  "org.scalablytyped" %%% "rollup" % "3.3.0-8b6f2a",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
