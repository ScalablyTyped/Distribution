organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "1.2.0-7cf598"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "del" % "5.1.0-397fbb",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200320Z-692182",
  "org.scalablytyped" %%% "fast-glob" % "3.2.2-0df9e4",
  "org.scalablytyped" %%% "globby" % "11.0.0-02dd82",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-aebf57",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-3920bd",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-81e912",
  "org.scalablytyped" %%% "rollup" % "1.32.1-1c2469",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
