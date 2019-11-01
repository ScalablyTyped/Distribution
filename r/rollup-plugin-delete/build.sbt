organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "1.1.0-53c892"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "del" % "5.1.0-cb75b7",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-3c0f0e",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e7576c",
  "org.scalablytyped" %%% "globby" % "10.0.1-5dc2db",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-4b5d2e",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "rollup" % "1.26.2-87c9cd",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        