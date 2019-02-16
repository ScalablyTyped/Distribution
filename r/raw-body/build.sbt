organization := "org.scalablytyped"
name := "raw-body"
version := "2.3.3-81a372"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bytes" % "3.0-dt-20180214Z-8e7ae7",
  "org.scalablytyped" %%% "http-errors" % "1.6-dt-20180214Z-ec3b07",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-2e0bc6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-0d969a",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        