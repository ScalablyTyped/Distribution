organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "2.0.0-5f55e2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "del" % "7.0.0-e11350",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-82853e",
  "org.scalablytyped" %%% "globby" % "13.1.2-8b296e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-ebdf8d",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-2fba71",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-a5c192",
  "org.scalablytyped" %%% "rollup" % "3.3.0-ebfd9f",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
