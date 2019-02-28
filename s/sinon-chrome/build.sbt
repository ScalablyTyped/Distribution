organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20181212Z-e7b2ed"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190218Z-0f5213",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20180827Z-0e186c",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20180214Z-80c69c",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190223Z-279a5f",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        