organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "1.1.0-1357b7"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "del" % "5.1.0-3011ea",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-1859c4",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-151f41",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-216f4d",
  "org.scalablytyped" %%% "globby" % "10.0.1-e0a0cd",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-c1e405",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-ac37f8",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-0eaa42",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-cf0508",
  "org.scalablytyped" %%% "rollup" % "1.20.2-509371",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        