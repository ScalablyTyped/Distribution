organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20181212Z-52e699"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190111Z-3412a2",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20180827Z-db21a1",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20180214Z-73aa99",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190125Z-ad8c3e",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        