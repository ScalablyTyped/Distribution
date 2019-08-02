organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "1.0.0-5ac2bc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "del" % "5.0.0-880479",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-35ffb4",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-7c1a28",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-5d59e8",
  "org.scalablytyped" %%% "globby" % "10.0.1-4304aa",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-40806c",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-fc3ac9",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-1aecf5",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-e114fc",
  "org.scalablytyped" %%% "rollup" % "1.18.0-1ea006",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        