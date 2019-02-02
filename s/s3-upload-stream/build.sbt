organization := "org.scalablytyped"
name := "s3-upload-stream"
version := "1.0-dt-20180214Z-ef2b0c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.395.0-f8a05a",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-2e86e4",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-88440d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-fdcda0",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-dbdaa1",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-d55f12")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        