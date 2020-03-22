organization := "org.scalablytyped"
name := "run-sequence"
version := "0.0-unknown-dt-20190322Z-0c4845"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-c1eb4e",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b49afb",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-482fb3",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-0d79d8",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-1967d2",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-998a02",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-769b20",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-4e137c",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-9a8c9a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
