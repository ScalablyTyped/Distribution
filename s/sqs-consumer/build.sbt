organization := "com.scalablytyped"
name := "sqs-consumer"
version := "3.8-dt-20180910Z-8573db"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "aws-sdk" % "2.339.0-ac06a2",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "jmespath" % "0.15-dt-20180910Z-5b1796",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-498ca7",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-95c0d9",
  "com.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-ee7416",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        