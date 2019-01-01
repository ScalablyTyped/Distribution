organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20181212Z-79369a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20181231Z-89881c",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20180827Z-729b6b",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20180214Z-7ebafd",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20181231Z-67301c",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        