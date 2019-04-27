organization := "org.scalablytyped"
name := "splunk-bunyan-logger"
version := "0.9-dt-20180705Z-0613b8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-ab8c0c",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-37ce53",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-ae3ed5",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-0d7ee5",
  "org.scalablytyped" %%% "splunk-logging" % "0.9-dt-20180705Z-16541a",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-36601b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        