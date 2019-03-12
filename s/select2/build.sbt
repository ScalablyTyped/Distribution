organization := "org.scalablytyped"
name := "select2"
version := "4.0-dt-20190227Z-e33d07"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-8061ce",
  "org.scalablytyped" %%% "requirejs" % "2.1.20-dt-20180214Z-07aee3",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a5e2be",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        