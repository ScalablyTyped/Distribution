organization := "org.scalablytyped"
name := "run-sequence"
version := "0.0-unknown-dt-20190322Z-b47a1d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.2.2-6e8841",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b7ccba",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-c54dc5",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-9d828b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-4b5d2e",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191023Z-ebe9d8",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-78bdcf",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-6c4994",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-e85074",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-ac8ac8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        