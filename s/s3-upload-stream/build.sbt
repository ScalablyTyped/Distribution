organization := "org.scalablytyped"
name := "s3-upload-stream"
version := "1.0-dt-20180910Z-25189d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.373.0-a50a67",
  "org.scalablytyped" %%% "events" % "1.2-dt-20180910Z-b61ae0",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180910Z-a98480",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-edb89a",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-07b459",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-bc3d01")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        