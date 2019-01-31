organization := "org.scalablytyped"
name := "s3-upload-stream"
version := "1.0-dt-20180214Z-139389"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.395.0-9a6642",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-746165",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-b22fa9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-4d28ec",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-a4f626",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-e1bdca")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        