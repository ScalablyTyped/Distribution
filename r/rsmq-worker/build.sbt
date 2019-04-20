organization := "org.scalablytyped"
name := "rsmq-worker"
version := "0.3.5-dt-20190322Z-33821d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "redis" % "2.8-dt-20190326Z-d2a4cd",
  "org.scalablytyped" %%% "rsmq" % "0.3.16-dt-20190322Z-f9a583",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        