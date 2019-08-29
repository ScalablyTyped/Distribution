organization := "org.scalablytyped"
name := "run-sequence"
version := "0.0-unknown-dt-20190322Z-5e2010"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.2-ce6c5f",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-7105af",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-976a4c",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-97ead7",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-c93eb3",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-af2daf",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-e8ff6c",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-a049d5",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-01bb64")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        