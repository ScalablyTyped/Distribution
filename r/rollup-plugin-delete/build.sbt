organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "1.1.0-05d41f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "del" % "5.1.0-2e73aa",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-1c2c91",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-993c07",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-2efa88",
  "org.scalablytyped" %%% "globby" % "10.0.1-c79c2b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-c93eb3",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190903Z-da4655",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-7a8e63",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-2bdc5e",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-f04b36",
  "org.scalablytyped" %%% "rollup" % "1.21.2-83a897",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        