organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "2.0.0-602b8c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "del" % "6.0.0-6d2617",
  "org.scalablytyped" %%% "fast-glob" % "3.2.4-a98b3d",
  "org.scalablytyped" %%% "globby" % "11.0.1-3b8367",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-b44da9",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-e9173e",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-931078",
  "org.scalablytyped" %%% "rollup" % "2.33.3-8326d2",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
