organization := "org.scalablytyped"
name := "s3-download-stream"
version := "0.1-dt-20180214Z-dfd369"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.428.0-776eb8",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-0bb70b",
  "org.scalablytyped" %%% "buffer" % "5.2.1-386da9",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-e5194e",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-578736",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20190322Z-2d2484",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-43c72f",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-440529")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        