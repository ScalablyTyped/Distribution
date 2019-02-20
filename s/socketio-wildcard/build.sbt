organization := "org.scalablytyped"
name := "socketio-wildcard"
version := "2.0-dt-20180314Z-d9e4b1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "socket_dot_io" % "2.1-dt-20181204Z-41330d",
  "org.scalablytyped" %%% "socket_dot_io-client" % "1.4.5-dt-20180214Z-4e20e4",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        