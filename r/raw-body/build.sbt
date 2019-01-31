organization := "org.scalablytyped"
name := "raw-body"
version := "2.3.3-86910c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bytes" % "3.0-dt-20180214Z-159a70",
  "org.scalablytyped" %%% "http-errors" % "1.6-dt-20180214Z-e8f6f5",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-b4d555",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        