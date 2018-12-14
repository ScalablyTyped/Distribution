organization := "org.scalablytyped"
name := "s3-download-stream"
version := "0.1-dt-20180910Z-d340ed"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.376.0-0b2405",
  "org.scalablytyped" %%% "events" % "1.2-dt-20180910Z-b61ae0",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180910Z-a98480",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-6f06eb",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-6fbd33",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-8e9a22")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        