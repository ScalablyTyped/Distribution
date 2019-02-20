organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20190212Z-07b18e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-6e46e7",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-77c9a7",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-75bcb5",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-fa86bf",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        