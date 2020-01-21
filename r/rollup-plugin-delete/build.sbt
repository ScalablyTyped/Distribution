organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "1.1.0-766cb8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "del" % "5.1.0-a4a558",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200108Z-2743ff",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-6320e5",
  "org.scalablytyped" %%% "globby" % "10.0.2-c60cd5",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-ce939a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "rollup" % "1.29.0-52b4bd",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        