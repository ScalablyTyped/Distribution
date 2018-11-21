organization := "com.scalablytyped"
name := "run-sequence"
version := "0.0-unknown-dt-20180910Z-9ead14"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-3d8188",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-1b2f14",
  "com.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-976de0",
  "com.scalablytyped" %%% "gulp" % "4.0-dt-20180910Z-4bb2d8",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-298c87",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "undertaker" % "1.2-dt-20180910Z-5352ac",
  "com.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180910Z-215b0e",
  "com.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-c07af2",
  "com.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20180910Z-c041e1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        