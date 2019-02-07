organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20181218Z-e720b7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-e022c1",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-43e947",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-3d3f50",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-eef1ee",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        