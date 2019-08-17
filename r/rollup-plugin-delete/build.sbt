organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "1.0.0-5e5465"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "del" % "5.0.0-33ab39",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-1859c4",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-c1e56f",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-3ec9ba",
  "org.scalablytyped" %%% "globby" % "10.0.1-89a2f7",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-c1e405",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-8df1d4",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-01e3d0",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-22d460",
  "org.scalablytyped" %%% "rollup" % "1.19.4-e60c64",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        