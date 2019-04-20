organization := "org.scalablytyped"
name := "run-sequence"
version := "0.0-unknown-dt-20190322Z-46e76a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-1a6bb5",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-3ecb5b",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-9f6abb",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-f6fdfd",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-57138d",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-04765f",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-ed7e48",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-d1b565",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-fad8bd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        