organization := "org.scalablytyped"
name := "splunk-logging"
version := "0.9-dt-20180910Z-5f1e77"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-dcf8bd",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-c69c6e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-6fc249",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-a4b796")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        