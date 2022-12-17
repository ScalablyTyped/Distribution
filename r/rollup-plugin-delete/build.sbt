organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "2.0.0-b5f58b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "del" % "7.0.0-554dc1",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-1585cd",
  "org.scalablytyped" %%% "globby" % "13.1.2-f2b914",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-32f022",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-f685e3",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-7921e7",
  "org.scalablytyped" %%% "rollup" % "3.3.0-1c8d6b",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
