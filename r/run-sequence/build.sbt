organization := "org.scalablytyped"
name := "run-sequence"
version := "0.0-unknown-dt-20180214Z-b9d1ad"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-1fbae9",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-0b7a31",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-2b754a",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-338bf1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-db2a02",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180217Z-177f6a",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-8cb637",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-5ec83f",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-0363e2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        