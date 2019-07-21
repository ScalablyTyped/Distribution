organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "1.0.0-2e792e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "del" % "5.0.0-3af882",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-f5e4db",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-1e9937",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ffce18",
  "org.scalablytyped" %%% "globby" % "10.0.1-990c81",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-41d0ad",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-12eef5",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-162f62",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-df5ea0",
  "org.scalablytyped" %%% "rollup" % "1.17.0-e55d35",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        