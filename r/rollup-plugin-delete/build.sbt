organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "1.1.0-5c87bd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "del" % "5.1.0-b7be05",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-189c55",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-5a6f0e",
  "org.scalablytyped" %%% "globby" % "10.0.1-8b358b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-5242bd",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "rollup" % "1.26.4-95a041",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        