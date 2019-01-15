organization := "org.scalablytyped"
name := "s3-download-stream"
version := "0.1-dt-20180214Z-828a49"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.388.0-49336e",
  "org.scalablytyped" %%% "events" % "1.2-dt-20180226Z-c24b3a",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-08827e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-3eb7b5",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-7936ed",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-534ed6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        