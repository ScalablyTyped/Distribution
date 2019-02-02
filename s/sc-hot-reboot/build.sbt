organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20181218Z-4898d7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-5eab45",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-303d98",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-bfca42",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-fb441d",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        