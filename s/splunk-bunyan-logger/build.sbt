organization := "com.scalablytyped"
name := "splunk-bunyan-logger"
version := "0.9-dt-20181102Z-d37972"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bunyan" % "1.8-dt-20181102Z-d016a4",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20181102Z-5bb15d",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181116Z-a46e60",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-64050c",
  "com.scalablytyped" %%% "splunk-logging" % "0.9-dt-20181102Z-ff8540",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181102Z-a43730",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        