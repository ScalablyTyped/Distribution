organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20190212Z-67a576"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-8b8449",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-1152fa",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-6ebab0",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-b9f6c3",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        