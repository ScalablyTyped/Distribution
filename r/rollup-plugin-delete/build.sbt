organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "1.1.0-3ad6e8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "del" % "5.1.0-c05500",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20191119Z-189c55",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-12e3c6",
  "org.scalablytyped" %%% "globby" % "10.0.1-6fcda5",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-5242bd",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191119Z-94c257",
  "org.scalablytyped" %%% "rollup" % "1.27.3-0ded9e",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        