organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20190212Z-54ea69"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-90134a",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-164c7d",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-2f8e4a",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-28441a",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        