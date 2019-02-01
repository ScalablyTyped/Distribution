organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20181218Z-27c2a5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-3de748",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-467e4e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-cb14d3",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-e55db8",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        