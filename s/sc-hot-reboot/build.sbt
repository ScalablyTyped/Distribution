organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20181218Z-acef13"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-c4aa11",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-b3a0e4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-4e2e29",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-9ba9e6",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        