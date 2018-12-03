organization := "com.scalablytyped"
name := "sqs-producer"
version := "1.5-dt-20180910Z-6aa137"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "aws-sdk" % "2.367.0-0868c4",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-2ed531",
  "com.scalablytyped" %%% "jmespath" % "0.15-dt-20180910Z-213c15",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-cee1b1",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-ea6562",
  "com.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-7c981e",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        